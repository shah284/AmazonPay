package pageobjectmodel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import common.InitilizeDriver;


public class LoginPage extends InitilizeDriver {

	@FindBy(xpath="//a[@id='nav-link-accountList']")
	WebElement Singin;

	@FindBy(xpath="//input[@name='email']")
	WebElement EmailorPhone_no_input_field;

	@FindBy(xpath="//input[@id='continue']")
	WebElement Continue;

	@FindBy(xpath="//input[@name='password']")
	WebElement Password_Inputfield;

	@FindBy(xpath="//input[@id='signInSubmit']")
	WebElement Signin_button;

	@FindBy(xpath="//*[@id='nav-logo-sprites']")
	WebElement Homepage_logo;

	public LoginPage() {
		PageFactory.initElements(driver, this);

	}
	public void click_on_signin() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3)); 
		Singin = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='nav-link-accountList']")));

		Singin.click();
	}

	public void Enter_phoneno(String phoneno) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(0)); 
		EmailorPhone_no_input_field = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='email']")));

		EmailorPhone_no_input_field.sendKeys(phoneno);
	}

	public void Click_on_Continue() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3)); 
		Continue = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='continue']")));

		Continue.click();
	}

	public void Enter_password(String password) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(0)); 
		Password_Inputfield = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")));

		Password_Inputfield.sendKeys(password);
	}

	public void Click_on_Signin_button() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3)); 
		Signin_button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='signInSubmit']")));

		Signin_button.click();
	}

	public void Verify_Login() {




	}


}
