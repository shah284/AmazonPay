package pageobjectmodel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import common.InitilizeDriver;


	public class CartPage extends InitilizeDriver{
		@FindBy(xpath = ("//div[@id='nav-cart-count-container']"))
	    WebElement CartIcon;
		@FindBy(xpath = ("//input[@name='proceedToRetailCheckout']"))
		WebElement ProceedToBuy_button;
		
	
	public CartPage() {
		PageFactory.initElements(driver, this);
			}
      public void click_on_CartIcon() {
    	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(0)); 
    	  
    	  CartIcon = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='nav-cart-count-container']")));
  		 
    	  CartIcon.click();
      }
      public void click_on_ProceedToBuy_button() {
    	  
    	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); 
    	   ProceedToBuy_button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='proceedToRetailCheckout']")));
    	  
    	  ProceedToBuy_button.click();
      }
      
}
