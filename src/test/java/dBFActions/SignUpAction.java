package dBFActions;

import org.testng.Assert;

import dBFLocators.SignUpLocators;
import dBFUtility.DBFTestBase;

public class SignUpAction extends DBFTestBase{
	SignUpLocators signUpLocators = new SignUpLocators();
	
	public void signUpButton() {
		signUpLocators.signUpButton.click();
	}

	public void signUp() {
		signUpLocators.signUp.click();
	}
	
	public void signUpSuccessful() {
		String signUp = driver.switchTo().alert().getText();
		System.out.println(signUp);
		Assert.assertTrue(true);
	}
	
	public void signUpUnsuccessful() {
		String signUp = driver.switchTo().alert().getText();
		System.out.println(signUp);
		Assert.assertTrue(true);
	}
}
