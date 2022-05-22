package dBFActions;

import org.openqa.selenium.By;
import org.testng.Assert;

import dBFLocators.CartLocators;
import dBFUtility.DBFTestBase;

public class CartAction extends DBFTestBase {
	CartLocators cartLocators = new CartLocators();
	
	public void galaxyS6() {
		cartLocators.galaxyS6.click();		
	}
	
	public void addToCart() {
		cartLocators.addToCart.click();		
	}
	
	public void cart() {
		cartLocators.cart.click();		
	}
	
	
	public void productTitle() {
		System.out.println(cartLocators.varifyProductTitle.getText());
		Assert.assertTrue(true);		
	}
	
	public void productPrice() {
		System.out.println(cartLocators.varifyProductPrice.getText());
		Assert.assertTrue(true);		
	}
	
	public void productPicture() {
		System.out.println(cartLocators.varifyProductPicture.getText());
		Assert.assertTrue(true);		
	}
	
	public void aboutUsOnCartPage() {
		System.out.println(cartLocators.varifyAboutUsDisplay.getText());
		Assert.assertTrue(true);		
	}
	
	public void getInTouchOnCartPage() {
		System.out.println(cartLocators.varifyGetInTouchDisplayed.getText());
		Assert.assertTrue(true);		
	}
	
	public void placeOrderButton() {
		cartLocators.varifyPlaceOrderButton.click();
	}
	
	public void verifyPlaceOrderButton() {
		boolean button = cartLocators.varifyPlaceOrderButton.isDisplayed();
		Assert.assertTrue(button);
	}
	public void placeOrderForm() {		
		System.out.println(cartLocators.varifyPlaceOrderForm.getText());
		Assert.assertTrue(true);
		
		/*String textToSearch = "Place order";
		boolean placeOrderForm = cartLocators.varifyPlaceOrderForm.getText().contains(textTitleToSearch);
		Assert.assertTrue(placeOrderForm);*/
		
		boolean purchaseButton = cartLocators.purchaseButton.isDisplayed();
		Assert.assertTrue(purchaseButton);
	}
	
}
