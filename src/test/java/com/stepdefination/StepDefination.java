package com.stepdefination;

import common.InitilizeDriver;
import io.cucumber.java.en.*;
import org.junit.*;
import pageobjectmodel.CartPage;
import pageobjectmodel.HomePage;
import pageobjectmodel.LoginPage;
import pageobjectmodel.OneTimePassword;
import pageobjectmodel.PaymentPage;
import pageobjectmodel.ProductPage;
import pageobjectmodel.PurchasePage;

public class StepDefination extends InitilizeDriver{
	private LoginPage loginPage;
	private HomePage homePage;
	private ProductPage productPage;
	private CartPage cartPage;
	private PurchasePage purchasePage;
	private PaymentPage paymentpage;
	private OneTimePassword OTP;
	
	public StepDefination() {
		this.loginPage = new LoginPage();
		this.homePage = new HomePage();
		this.productPage = new ProductPage();
		this.cartPage = new CartPage();
		this.purchasePage = new PurchasePage();
		this.paymentpage = new PaymentPage();
		this.OTP = new OneTimePassword();
	}
	@Given("the user is on the Amazon homepage")
	public void the_user_is_on_the_amazon_homepage()  { 
		InitilizeDriver.initializeBrowser();
	    
	}
	@When("the user clicks on the Login button")
	public void the_user_clicks_on_the_login_button() {
	
		
		this.loginPage.click_on_signin();
	    
	}
	@When("the user enter valid credential")
	public void the_user_enter_valid_credential() {
		this.loginPage.Enter_phoneno("");
		this.loginPage.Click_on_Continue();
		this.loginPage.Enter_password("");
		this.loginPage.Click_on_Signin_button();
		
		
	    
	}
	@Then("the user should be logged in successfully")
	public void the_user_should_be_logged_in_successfully() {
		Assert.assertEquals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in", driver.getTitle());
		
	    
	}
	
	@When("the user searches for a product in the search bar")
	public void the_user_searches_for_a_product_in_the_search_bar() {
		this.homePage.click_on_Searchbar();
	    
	}
	@Then("the user should see a list of products related to the search")
	public void the_user_should_see_a_list_of_products_related_to_the_search() {
		this.homePage.click_on_Searchbutton();
	    
	}
	
	@When("the user selects a product from the results")
	public void the_user_selects_a_product_from_the_results() {
		this.productPage.click_on_Addtocart();
	    
	}
	@When("the user clicks on the Add to Cart button")
	public void the_user_clicks_on_the_add_to_cart_button() {
		this.productPage.click_on_Addedtocart();
	    
	}
	@Then("the product should be added to the cart successfully")
	public void the_product_should_be_added_to_the_cart_successfully() {
		Assert.assertEquals("Amazon.in Shopping Cart", driver.getTitle());
		
	    
	}
	@When("the user clicks on the Cart icon")
	public void the_user_clicks_on_the_cart_icon() {
		this.cartPage.click_on_CartIcon();
	    
	}
	@When("the user clicks on the Proceed to Buy button")
	public void the_user_clicks_on_the_proceed_to_buy_button() {
		this.cartPage.click_on_ProceedToBuy_button();
	    
	}
	@Then("the user should be navigated to the delivery details page")
	public void the_user_should_be_navigated_to_the_delivery_details_page() {
		Assert.assertEquals("Select a delivery address", driver.getTitle());
		
	    
	}
	@When("the user selects a delivery address")
	public void the_user_selects_a_delivery_address() {
		this.purchasePage.click_on_addressButton();
		
	    
	}
	@When("the user clicks on the Continue button")
	public void the_user_clicks_on_the_continue_button() {
		this.purchasePage.click_on_cardDetail();
	    
	}
	
	@And("the user selects a payment method")
	public void the_user_selects_a_payment_method() {
		this.paymentpage.click_on_paymentMethodButton();
		this.paymentpage.click_on_orderPayButton();
		
	    
	}
	@Then("the user should be able to review the order and proceed to payment")
	public void the_user_should_be_able_to_review_the_order_and_proceed_to_payment() {
		this.OTP.switch_to_frame();
		this.OTP.enter_OTP();
		
		driver.quit();
	    
	}




}
