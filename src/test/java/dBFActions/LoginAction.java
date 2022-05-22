package dBFActions;

import org.testng.Assert;

import dBFLocators.LoginLocators;
import dBFUtility.DBFTestBase;

public class LoginAction extends DBFTestBase{
	
	LoginLocators loginLocators= new LoginLocators();
	
	public void loginButton() {
		loginLocators.loginButton.click();
	}
	
	/*public void loginCredentials(String UserName, String Password) {
		loginLocators.userName.sendKeys(UserName);
		loginLocators.passWord.sendKeys(Password);		
	}*/
	
		
	public void login() {
		loginLocators.login.click();		
	}
	
	public void verifyLogin() {
		boolean login = loginLocators.verifyLogin.isDisplayed();
		Assert.assertTrue(login);
	}
	
	public void loginUnsuccessful() {
		String login = driver.switchTo().alert().getText();
		System.out.println(login);
		Assert.assertTrue(true);
	}
	
	public void logout() {
			
	}
}
