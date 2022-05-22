package dBFLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import dBFUtility.DBFTestBase;

public class LoginLocators extends DBFTestBase {
	
	public LoginLocators() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID, using="login2")// here we can find by id/name/xpath
	public WebElement loginButton;
	
	@FindBy(how=How.ID, using="loginusername")// here we can find by id/name/xpath
	public WebElement userName;
	
	@FindBy(how=How.ID, using="loginpassword")// here we can find by id/name/xpath
	public WebElement passWord;
	
	@FindBy(how=How.XPATH, using="//button[text() = 'Log in']")// here we can find by id/name/xpath
	public WebElement login;
	
	@FindBy(how=How.ID, using="nava")// here we can find by id/name/xpath
	public WebElement verifyLogin;
	
}
