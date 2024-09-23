package pageobjectmodel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import common.InitilizeDriver;

public class PaymentPage extends InitilizeDriver{

	@FindBy(xpath = ("//span[@class='a-button-inner']//input[@name='ppw-widgetEvent:SetPaymentPlanSelectContinueEvent']"))
	WebElement paymentMethodButton;
	@FindBy(xpath = ("//span[@class='a-button-inner']//input[@aria-labelledby='bottomSubmitOrderButtonId-announce']"))
	WebElement orderPayButton;
	
	public PaymentPage() {
		PageFactory.initElements(driver, this);

	}
	
	public void click_on_paymentMethodButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30)); 
		paymentMethodButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='a-button-inner']//input[@name='ppw-widgetEvent:SetPaymentPlanSelectContinueEvent']")));
		paymentMethodButton.click();
	}
	public void click_on_orderPayButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60)); 
		orderPayButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='a-button-inner']//input[@aria-labelledby='bottomSubmitOrderButtonId-announce']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", orderPayButton);

        try {
        	orderPayButton.click();
        } catch (ElementClickInterceptedException e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", orderPayButton);
        }
		
		
	}
	
}