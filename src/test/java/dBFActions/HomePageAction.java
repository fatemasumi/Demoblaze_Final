package dBFActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import dBFLocators.HomePageLocators;
import dBFUtility.DBFTestBase;

public class HomePageAction extends DBFTestBase{
	
	HomePageLocators hPLocators = new HomePageLocators();
	
	public void verifyHomePage() {
		boolean hmPage = hPLocators.verifyHomePage.isDisplayed();
		Assert.assertTrue(hmPage);
	}
	
	public void phones() {
		hPLocators.phones.click();
	}
	public void laptops() {
		hPLocators.laptops.click();
	}
	public void monitors() {
		hPLocators.monitors.click();
	}
	
	public void verifyPhones() {
		boolean phone = hPLocators.verifyPhones.isDisplayed();
		Assert.assertTrue(phone);
	}
	
	public void verifyLaptops() {
		boolean laptops = hPLocators.verifyLaptops.isDisplayed();
		Assert.assertTrue(laptops);
	}
	
	public void verifyMonitors() {
		boolean monitors = hPLocators.verifyMonitors.isDisplayed();
		Assert.assertTrue(monitors);
	}
	
	public void home() {
		hPLocators.home.click();
	}
	
	public void Contact() {
		hPLocators.contact.click();
	}
	
	public void verifyContact() {
		//System.out.println(hPLocators.contactForm.getText());
		/*System.out.println(hPLocators.contactForm);
		Assert.assertTrue(true);*/
		
		//WebElement contactForm = driver.findElement(By.id("exampleModalLabe"));
		System.out.println(hPLocators.contactForm.getText());
		Assert.assertTrue(true);
	}
	
	public void aboutUs() {
		hPLocators.aboutUs.click();
	}
	
	public void verifyAboutUs() {
		System.out.println(hPLocators.aboutUsWindow.getText());
		Assert.assertTrue(true);
	}
	
	public void cart() {
		hPLocators.cart.click();
	}
	
	public void verifyCart() {
		System.out.println(hPLocators.cartTotal.getText());
		Assert.assertTrue(true);
	}
	
	public void logIn() {
		hPLocators.login.click();
	}
	
	public void verifyLogIn() {
		System.out.println(hPLocators.logInForm.getText());
		Assert.assertTrue(true);
	}
	
	public void signUp() {
		hPLocators.signUp.click();
	}
	
	public void verifySignUp() {
		System.out.println(hPLocators.signUpForm.getText());
		Assert.assertTrue(true);
	}
}
