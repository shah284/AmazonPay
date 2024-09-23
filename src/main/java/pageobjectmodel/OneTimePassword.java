package pageobjectmodel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import common.InitilizeDriver;

public class OneTimePassword extends InitilizeDriver {
	@FindBy(id = ("cards-web-sdk-iframe"))
	WebElement iframe;
	@FindBy(xpath = ("//input[@type='text']"))
	WebElement OTP;
	public OneTimePassword() {
		PageFactory.initElements(driver, this);
	}
   public void switch_to_frame() {
	   
	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50)); 
	   iframe = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("cards-web-sdk-iframe")));
	   
	driver.switchTo().frame(iframe);  
   }
   public void enter_OTP() {
	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5)); 
		OTP = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text']")));
	   OTP.click();
   }
}
