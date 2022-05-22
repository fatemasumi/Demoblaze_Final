package dBFActions;



import org.testng.Assert;

import dBFLocators.ContactLocators;
import dBFUtility.DBFTestBase;
import dBFUtility.DBFTestUtility;


public class ContactAction extends DBFTestBase{
	
	ContactLocators contactLocators =new  ContactLocators();
	
	public void contactDetails(String ContactEmail, String ContactName, String Message) throws Exception
	{		
		contactLocators.contactEmail.sendKeys(ContactEmail);
		Thread.sleep(2000);
		contactLocators.contactName.sendKeys(ContactName);
		Thread.sleep(2000);
		contactLocators.message.sendKeys(Message);			
		Thread.sleep(2000);
		DBFTestUtility.takeScreenShot(driver, "contactPage");
	}
	
	public void contact() {
		contactLocators.contact.click();
	}
	
	public void contactForm() {
		System.out.println(contactLocators.contactForm.getText());
		Assert.assertTrue(true);
	}
	
	public void sendMessage() {
		contactLocators.sendMessageButton.click();
	}
	
	public void close() {
		System.out.println(contactLocators.close.getText());
		Assert.assertTrue(true);
	}
	
	public void homePage() {
		boolean home = contactLocators.home.isDisplayed();
		Assert.assertTrue(home);
	}
	
	public void sentMessageSuccessfully() {
		boolean msg = driver.switchTo().alert().getText().contains("Thanks for the message!!");
		Assert.assertTrue(msg);
		System.out.println(msg);
		driver.switchTo().alert().accept();		
	}
}
