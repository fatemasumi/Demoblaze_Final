package dBFLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import dBFUtility.DBFTestBase;

public class CartLocators extends DBFTestBase{
	
	public CartLocators() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH, using="//a[text() ='Samsung galaxy s6']")// here we can find by id/name/xpath
	public WebElement galaxyS6;
	
	@FindBy(how=How.XPATH, using="//a[text() ='Add to cart']")// here we can find by id/name/xpath
	public WebElement addToCart;
	
	@FindBy(how=How.XPATH, using="//td[text() ='Samsung galaxy s6']")// here we can find by id/name/xpath
	public WebElement varifyProductTitle; 
	
	@FindBy(how=How.XPATH, using="//img[@src='imgs/galaxy_s6.jpg']")// here we can find by id/name/xpath
	public WebElement varifyProductPicture;
	
	@FindBy(how=How.ID, using="cartur")// here we can find by id/name/xpath
	public WebElement cart;
	
	@FindBy(how=How.XPATH, using="//td[text() ='360']")// here we can find by id/name/xpath
	public WebElement varifyProductPrice;
	
	@FindBy(how=How.XPATH, using="//b[text() ='About Us']")// here we can find by id/name/xpath
	public WebElement varifyAboutUsDisplay;
	
	@FindBy(how=How.XPATH, using="//b[text() ='Get in Touch']")// here we can find by id/name/xpath
	public WebElement varifyGetInTouchDisplayed;

	@FindBy(how=How.XPATH, using="//button[text() ='Place Order']")// here we can find by id/name/xpath
	public WebElement varifyPlaceOrderButton;

	@FindBy(how=How.CLASS_NAME, using="modal-title")// here we can find by id/name/xpath
	public WebElement varifyPlaceOrderForm;
	
	@FindBy(how=How.XPATH, using="//button[text() ='Purchase']")// here we can find by id/name/xpath
	public WebElement purchaseButton;
	
}
