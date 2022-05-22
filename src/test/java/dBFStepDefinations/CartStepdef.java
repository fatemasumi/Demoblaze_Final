package dBFStepDefinations;

import org.openqa.selenium.JavascriptExecutor;

import dBFActions.CartAction;
import dBFUtility.DBFTestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartStepdef extends DBFTestBase{
	
	CartAction cartAction = new CartAction();
	
	@Given("Launch {string}")
	public void launch(String URL) {
	    launchApplication(URL);
	}

	@When("Click on Galaxy S6")
	public void click_on_galaxy_s6() {
	   cartAction.galaxyS6();
	}
	
	@When("Click on add to cart button & Accept pop-up")
	public void click_on_add_to_cart_button_accept_pop_up() throws Exception {
	    cartAction.addToCart();
	    Thread.sleep(2000);
	    driver.switchTo().alert().accept();
	}	
	
	@Then("Verify product picture is displayed")
	public void verify_product_picture_is_displayed() {
	    cartAction.productPicture();
	}

	@Then("Verify product title is displayed")
	public void verify_product_title_is_displayed() {
	    cartAction.productTitle();
	}
	
	@Then("Verify product  price is displayed")
	public void verify_product_price_is_displayed() {
		cartAction.productPrice();
	}

	@Then("Verify get in touch is displayed on the bottom of the cart page")
	public void verify_get_in_touch_is_displayed_on_the_bottom_of_the_cart_page() {
	    cartAction.getInTouchOnCartPage();
	}

	@Then("Verify get in About us is displayed on the bottom of the cart page")
	public void verify_get_in_about_us_is_displayed_on_the_bottom_of_the_cart_page() {
	   cartAction.aboutUsOnCartPage();
	}
	
	@When("Click on cart button")
	public void click_on_cart_button() {
	    cartAction.cart();
	}

	@Then("verify Place order button displayed on cart page")
	public void verify_Place_order_button_displayed_on_cart_page() {
	    cartAction.verifyPlaceOrderButton();
	}

	@When("Click on Place Order button")
	public void click_on_place_order_button() {
	    cartAction.placeOrderButton();
	}

	@Then("Verify Place Order form displayed")
	public void verify_place_order_form_displayed() throws Exception {
		((JavascriptExecutor)driver).executeScript("scroll(0,400)");
		Thread.sleep(2000);
	    cartAction.placeOrderForm();
		
		
	}

}
