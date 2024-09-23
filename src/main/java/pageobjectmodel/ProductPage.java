package pageobjectmodel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import common.InitilizeDriver;

public class ProductPage extends InitilizeDriver{
	@FindBy(xpath = ("//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-3']"))
	WebElement Searchproduct;
	@FindBy(xpath = ("//button[@id='a-autoid-3-announce']"))
	WebElement Addtocart;
	@FindBy(xpath = ("//a[@id='nav-cart']"))
	WebElement Addedtocart;
	public ProductPage() {
		PageFactory.initElements(driver, this);
			}
	public void select_a_Searchproduct() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(0)); 
		Searchproduct = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-3']")));
		 
		Searchproduct.findElement(By.linkText("Cureveda Herbal Pureprash Immunity Booster for all age groups- Jaggery based, Saffron Kesar, sugar free Chyawanprash (500gms)"));
	}
     	public void click_on_Addtocart() {
     		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(0)); 
    		Addtocart = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='a-autoid-3-announce']")));
    		 
    		Addtocart.click();
     		
     	}
     	public void click_on_Addedtocart() {
     		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
    		Addedtocart = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='nav-cart']")));
    		 
    		Addedtocart.click();
     	
}
}

