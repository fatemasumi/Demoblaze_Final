package dBFStepDefinations;

import dBFActions.ContactAction;
import dBFLocators.ContactLocators;
import dBFUtility.DBFTestBase;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactStepdef extends DBFTestBase {
	
	ContactAction contactAction = new ContactAction();

	
	@When("Clicks on contact")
	public void clicks_on_contact() throws Exception {
		contactAction.contact();
	}

	@Then("Validate contact button is clickable")
	public void validate_contact_button_is_clickable() {
		contactAction.contactForm();
	}
	
	@When("User clicked Send Messsage button")
	public void user_clicked_send_messsage_button() {
		contactAction.sendMessage();
	}

	@Then("Validates send message button is clickable") 
	public void validates_send_message_button_is_clickable() throws Exception {
		
		contactAction.sentMessageSuccessfully();
		driver.switchTo().alert().accept();
	}
	
	@When("User clicked Close button")
	public void user_clicked_close_button() {
		contactAction.close();
	}

	@Then("Validates close button is clickable")
	public void validates_close_button_is_clickable() throws Exception {
		
		contactAction.homePage();
	}
	
	@When("Types contact email, contact name and message")
	public void types_contact_email_contact_name_and_message() throws Exception {
	    	 contactAction.contactDetails(prop.getProperty("ContactEmail"), prop.getProperty("ContactName"), prop.getProperty("Message"));
	    	 
	}

	
	@Then("Validates message is sent")
	public void validates_message_is_sent() throws Exception {
		Thread.sleep(3000);
		contactAction.sentMessageSuccessfully();
		driver.switchTo().alert().accept();
	}
	
	
	

}
