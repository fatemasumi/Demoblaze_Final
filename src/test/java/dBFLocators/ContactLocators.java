package dBFLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import dBFUtility.DBFTestBase;

public class ContactLocators extends DBFTestBase{

	public ContactLocators() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH, using="//a[text()='Contact']")// here we can find by id/name/xpath
	public WebElement contact;	
	
	@FindBy(how=How.ID, using="exampleModalLabel") // here we can find by id/name/xpath
	public WebElement contactForm;
	
	@FindBy(how=How.XPATH, using="//button[text()='Send message']") // here we can find by id/name/xpath
	public WebElement sendMessageButton;
	
	@FindBy(how=How.XPATH, using="/html/body/div[1]/div/div/div[3]/button[1]") // here we can find by id/name/xpath
	public WebElement close;
	
	@FindBy(how=How.ID, using="nava") // here we can find by id/name/xpath
	public WebElement home;
	
	@FindBy(how=How.ID, using="recipient-email") // here we can find by id/name/xpath
	public WebElement contactEmail;
	
	@FindBy(how=How.ID, using="recipient-name") // here we can find by id/name/xpath
	public WebElement contactName;
	
	@FindBy(how=How.ID, using="message-text") // here we can find by id/name/xpath
	public WebElement message;
	
	
	
}
