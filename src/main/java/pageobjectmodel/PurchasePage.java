package pageobjectmodel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import common.InitilizeDriver;

public class PurchasePage extends InitilizeDriver{
	@FindBy(xpath = ("//input[@aria-labelledby='shipToThisAddressButton-announce']"))
	WebElement addressButton;
	@FindBy(xpath = ("//input[@value = 'instrumentId=0h_PE_CUS_3c9d4e2c-50b9-4b8b-90d7-732ea32190e2&isExpired=false&paymentMethod=CC&tfxEligible=false']"))
	WebElement cardDetail;
	public PurchasePage() {
		PageFactory.initElements(driver, this);

	}
	public void click_on_addressButton() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); 

		addressButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@aria-labelledby='shipToThisAddressButton-announce']")));

		addressButton.click();
	}

	public void click_on_cardDetail() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 

		cardDetail = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value = 'instrumentId=0h_PE_CUS_3c9d4e2c-50b9-4b8b-90d7-732ea32190e2&isExpired=false&paymentMethod=CC&tfxEligible=false']")));

		cardDetail.click();
	}
}
