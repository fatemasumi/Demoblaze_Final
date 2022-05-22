package dBFStepDefinations;

import org.openqa.selenium.JavascriptExecutor;

import dBFActions.HomePageAction;
import dBFUtility.DBFTestBase;
import dBFUtility.DBFTestUtility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageStepdef extends DBFTestBase{
	
	HomePageAction hMAction = new HomePageAction();
	
	@Given("User launch {string}")
	public void user_launch(String URL) {
	    launchApplication(URL);
	}

	@Then("Validate homapage is displayed")
	public void validate_homapage_is_displayed() {
	    hMAction.verifyHomePage();
	}

	@When("Clicks on phones")
	public void clicks_on_phones() throws Exception {
		hMAction.phones();		
		Thread.sleep(2000);		
	}

	@Then("Validate phones is displayed")
	public void validate_phones_is_displayed() throws Exception {
		((JavascriptExecutor)driver).executeScript("scroll(0,200)");
		hMAction.verifyPhones();
		Thread.sleep(2000);
	}
	
	@When("Clicks on laptops")
	public void clicks_on_laptops() throws Exception {
		((JavascriptExecutor)driver).executeScript("scroll(0,200)");
		hMAction.laptops();
		Thread.sleep(2000);
	}
	
	@Then("Validate laptops is displayed")
	public void validate_laptops_is_displayed() throws Exception {
		((JavascriptExecutor)driver).executeScript("scroll(0,200)");
		hMAction.verifyLaptops();
		Thread.sleep(2000);
	}

	@When("Clicks on monitors")
	public void clicks_on_monitors() throws Exception {
		((JavascriptExecutor)driver).executeScript("scroll(0,200)");
		hMAction.monitors();
		Thread.sleep(2000);
	}
	
	@Then("Validate monitors is displayed")
	public void validate_monitors_is_displayed() throws Exception {
		((JavascriptExecutor)driver).executeScript("scroll(0,200)");
		hMAction.verifyMonitors();
		Thread.sleep(2000);
	}
	
	@When("Clicks on Home button")
	public void clicks_on_home_button() {
	    hMAction.home();
	    DBFTestUtility.takeScreenShot(driver, "home");
	}

	@When("Clicks on Cart button")
	public void clicks_on_cart_button() {
	    hMAction.cart();
	}

	@Then("Validate Cart button is Clickable\"")
	public void validate_cart_button_is_clickable() {
	    hMAction.verifyCart();
	    DBFTestUtility.takeScreenShot(driver, "cart");
	}

	@When("Clicks on Contact button")
	public void clicks_on_contact_button() {
	    hMAction.Contact();
	    
	}

	@Then("Validate contact button is Clickable\"")
	public void validate_contact_button_is_clickable() {
	    hMAction.verifyContact();
	    DBFTestUtility.takeScreenShot(driver, "contact");
	}

	@When("Clicks on About us button")
	public void clicks_on_about_us_button() {
	    hMAction.aboutUs();
	}

	@Then("Validate About us button is Clickable")
	public void validate_about_us_button_is_clickable() {
	    hMAction.verifyAboutUs();
	    DBFTestUtility.takeScreenShot(driver, "aboutUs");
	}

	
	@When("Clicks on log in button")
	public void clicks_on_log_in_button() {
		hMAction.logIn();
		
	}

	@Then("Validate log in button is Clickable\"")
	public void validate_log_in_button_is_clickable() {
		hMAction.verifyLogIn();
		DBFTestUtility.takeScreenShot(driver, "login");
	}
	
	@When("Clicks on Sign up button")
	public void clicks_on_sign_up_button() {
	    hMAction.signUp();
	}

	@Then("Validate Sign up button is Clickable\"")
	public void validate_sign_up_button_is_clickable() {
	    hMAction.verifySignUp();
	    DBFTestUtility.takeScreenShot(driver, "signup");
	}


	
}
