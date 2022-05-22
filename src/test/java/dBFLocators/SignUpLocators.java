package dBFLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import dBFUtility.DBFTestBase;

public class SignUpLocators extends DBFTestBase {
	public SignUpLocators() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID, using="signin2")// here we can find by id/name/xpath
	public WebElement signUp;
	
	@FindBy(how=How.ID, using="sign-username")// here we can find by id/name/xpath
	public WebElement signUserName;
	
	@FindBy(how=How.ID, using="sign-password")// here we can find by id/name/xpath
	public WebElement signPassWord;
	
	@FindBy(how=How.XPATH, using="//button[text() = 'Sign up']")// here we can find by id/name/xpath
	public WebElement signUpButton;
	
	@FindBy(how=How.ID, using="nava")// here we can find by id/name/xpath
	public WebElement verifyLogin;

}
