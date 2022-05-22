package dBFLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import dBFUtility.DBFTestBase;

public class AboutUsLocators extends DBFTestBase{
	
	public AboutUsLocators() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH, using="//a[text() = 'About us']")// here we can find by id/name/xpath
	public WebElement aboutUsButton;
	
	@FindBy(how=How.CLASS_NAME, using="modal-title")// here we can find by id/name/xpath
	public WebElement aboutUsWindow;
	
	
	@FindBy(how=How.XPATH, using="/html/body/div[4]/div/div/div[1]/button/span")// here we can find by id/name/xpath
	public WebElement abtUsXbtn; 
	
	@FindBy(how=How.XPATH, using="/html/body/div[4]/div/div/div[3]/button")// here we can find by id/name/xpath
	public WebElement aboutUsWindowClose;
	
	@FindBy(how=How.ID, using="nava")// here we can find by id/name/xpath
	public WebElement homePage;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"example-video\"]/button")// here we can find by id/name/xpath
	public WebElement playIcon;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"example-video\"]")// here we can find by id/name/xpath
	public WebElement rePlay;
	
	@FindBy(how=How.ID, using="example-video_html5_api")// here we can find by id/name/xpath
	public WebElement verifyVideo;

}
