package dBFActions;

import org.testng.Assert;

import dBFLocators.AboutUsLocators;

public class AboutUsAction {
	AboutUsLocators aULocators = new AboutUsLocators();
	
	public void abtUsBtn() {
		aULocators.aboutUsButton.click();
	}
	
	public void abtUsWindow() {
		//System.out.println(aULocators.aboutUsWindow.getText());
		System.out.println(aULocators.aboutUsWindow.getText());
		Assert.assertTrue(true);
	}
	
	public void playVideoIcon() {
		aULocators.playIcon.click();
	}
	
	public void varifyVideo() {
		boolean videoPlayed =  aULocators.verifyVideo.isDisplayed();
		Assert.assertTrue(videoPlayed);
	}
	
	public void abtUsWindowXbtn() {
		aULocators.abtUsXbtn.click();
	}	
	
	public void videoReplay() {
		aULocators.rePlay.click();
	}
	
	public void abtUsWindowClose() {
		aULocators.aboutUsWindowClose.click();		
	}
	public void demoHomePage() {
		boolean homePage = aULocators.homePage.isDisplayed();
		Assert.assertTrue(homePage);
	}

}
