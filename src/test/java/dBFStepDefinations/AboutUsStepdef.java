package dBFStepDefinations;


import dBFActions.AboutUsAction;
import dBFUtility.DBFTestBase;
import dBFUtility.DBFTestUtility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AboutUsStepdef extends DBFTestBase{
	AboutUsAction abtUsAction = new AboutUsAction();
	
	@Given("user launch {string}")
	public void user_launch(String URL) {
	   launchApplication(URL); 
	}

	@When("click on About us and window pop-u")
	public void click_on_about_us() throws Exception {
		abtUsAction.abtUsBtn();
		Thread.sleep(3000);
		DBFTestUtility.takeScreenShot(driver, "aboutUs");
	}
	
	@Then("user validate window")
	public void user_validate_window() {
	    abtUsAction.abtUsWindow();
	}
	
	@When("click the play video icon")
	public void click_the_play_video_icon() {
	    abtUsAction.playVideoIcon();
	}
	
	@Then("user validate video played")
	public void user_validate_video_played() {
	    abtUsAction.varifyVideo();
	}
	
	@When("Click on X button")
	public void click_on_x_button() {
		abtUsAction.abtUsWindowXbtn(); 
	}
	
	@When("click the play video button")
	public void click_the_play_video_button() {
	    abtUsAction.videoReplay();
	}
	
	@Then("user validate video replayed")
	public void user_validate_video_replayed() {
		abtUsAction.varifyVideo();
	}

	@Then("about us window closed and navigated to home page")
	public void about_us_window_closed_and_navigated_to_home_page() {
		abtUsAction.demoHomePage();
	}

	@When("Click on Close button")
	public void click_on_close_button() {
		abtUsAction.abtUsWindowClose();
	}

}
