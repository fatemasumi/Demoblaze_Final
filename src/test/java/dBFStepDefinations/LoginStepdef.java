package dBFStepDefinations;

import dBFActions.LoginAction;
import dBFLocators.LoginLocators;
import dBFUtility.DBFTestBase;
import dBFUtility.DBFTestUtility;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepdef extends DBFTestBase{	
	
	LoginAction loginAction = new LoginAction();
	
	LoginLocators loginLocators = new LoginLocators();
	
	@When("I click login button")
	public void i_click_login_button() {
		loginAction.loginButton();		
	}

	@When("User enters  {string} and {string}")
	public void user_enters_and(String username, String password) throws Exception {
		loginLocators.userName.sendKeys(username);
		loginLocators.passWord.sendKeys(password);
	}
	
	@When("click login")
	public void click_login() {
		loginAction.login(); 
	}

	
	@Then("Verify login successfull")
	public void verify_login_successfull() {
		loginAction.verifyLogin();
	}
	
	@Then("Verify login is not successfull")
	public void verify_login_is_not_successfull() throws Exception {
		Thread.sleep(3000);
	    loginAction.loginUnsuccessful();
	    driver.switchTo().alert().accept();
	}
}

