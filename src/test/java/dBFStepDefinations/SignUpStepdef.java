package dBFStepDefinations;

import dBFActions.SignUpAction;
import dBFLocators.SignUpLocators;
import dBFUtility.DBFTestBase;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignUpStepdef extends DBFTestBase{
	
	SignUpAction signUpAction = new SignUpAction();
	SignUpLocators signUpLocators = new SignUpLocators();
	
	@When("I click sign-up button")
	public void i_click_sign_up_button() {
		signUpAction.signUp();
	}
	
	@When("User types  {string} and {string}")
	public void user_types_and(String userName, String passWord) throws Exception {
		signUpLocators.signUserName.sendKeys(userName);
		signUpLocators.signPassWord.sendKeys(passWord);
	}

	@When("click sign-up")
	public void click_sign_up() throws Exception{
		signUpAction.signUpButton();
		Thread.sleep(3000);
		
	}

	@Then("Verify sign-up successfull")
	public void verify_sign_up_successfull()throws Exception {
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
	        
	    
	}
	
	@Then("Verify sign-up is not successfull")
	public void verify_sign_up_is_not_successfull() throws Exception {
		signUpAction.signUpUnsuccessful();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
	}

}
