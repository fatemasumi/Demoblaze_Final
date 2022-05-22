package dBFLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import dBFUtility.DBFTestBase;

public class HomePageLocators extends DBFTestBase{
	
	public HomePageLocators() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.ID, using="nava")// here we can find by id/name/xpath
	public WebElement verifyHomePage;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"itemc\"]")// here we can find by id/name/xpath
	public WebElement phones; 
	
	@FindBy(how=How.XPATH, using="//*[@id=\"itemc\"]")// here we can find by id/name/xpath
	public WebElement laptops;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"itemc\"]")// here we can find by id/name/xpath
	public WebElement monitors;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"tbodyid\"]/div[1]/div/a/img")// here we can find by id/name/xpath
	public WebElement verifyPhones;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"tbodyid\"]/div[1]/div/a/img")// here we can find by id/name/xpath
	public WebElement verifyLaptops; 
	
	@FindBy(how=How.XPATH, using="//*[@id=\"tbodyid\"]/div[1]/div/a/img")// here we can find by id/name/xpath
	public WebElement verifyMonitors;

	@FindBy(how=How.CLASS_NAME, using="nav-link")// here we can find by id/name/xpath
	public WebElement home;
	
	@FindBy(how=How.XPATH, using="//a[text()='Contact']")// here we can find by id/name/xpath
	public WebElement contact;
	
	@FindBy(how=How.XPATH, using="//a[text()='About us']")// here we can find by id/name/xpath
	public WebElement aboutUs; 
	
	@FindBy(how=How.XPATH, using="//a[text()='Cart']")// here we can find by id/name/xpath
	public WebElement cart; 
	
	@FindBy(how=How.XPATH, using="//a[text()='Log in']")// here we can find by id/name/xpath
	public WebElement login;
	
	@FindBy(how=How.XPATH, using="//a[text()='Sign up']")// here we can find by id/name/xpath
	public WebElement signUp;
	
	@FindBy(how=How.ID, using="exampleModalLabel")// here we can find by id/name/xpath
	public WebElement contactForm;
	
	@FindBy(how=How.CLASS_NAME, using="modal-title")// here we can find by id/name/xpath
	public WebElement aboutUsWindow;
	
	@FindBy(how=How.XPATH, using="//h2[text()='Products']")// here we can find by id/name/xpath
	public WebElement cartTotal;
	
	@FindBy(how=How.ID, using="logInModalLabel")// here we can find by id/name/xpath
	public WebElement logInForm;
	
	@FindBy(how=How.ID, using="signInModalLabel")// here we can find by id/name/xpath
	public WebElement signUpForm;
	
}
