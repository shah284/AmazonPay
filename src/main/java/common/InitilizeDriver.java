package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class InitilizeDriver {
	
	public static WebDriver driver;
	
	
	public static void initializeBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/mohds/Dropbox/My PC (LAPTOP-50LM6JM8)/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
        
}
}
