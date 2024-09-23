package pageobjectmodel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import common.InitilizeDriver;

public class HomePage extends InitilizeDriver {
	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	WebElement Searchbar;
	@FindBy(xpath = "//input[@id='nav-search-submit-button']")
	WebElement Searchbutton;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public void click_on_Searchbar() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(0)); 
		Searchbar = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='twotabsearchtextbox']")));

		Searchbar.sendKeys("chyawanprash");

	}
	public void click_on_Searchbutton() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
		Searchbar = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='nav-search-submit-button']")));

		Searchbar.click();
	}
}