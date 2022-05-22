package dBFTestRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import dBFUtility.DBFTestBase;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = {"src/java/Resources/DBFFeatures"}, 
plugin = {"json:target/cucumber.json"},
glue = "dBFStepDefinations", tags= "@sendMessage")



public class DBFTestRunner extends AbstractTestNGCucumberTests {
	
	@BeforeTest
	public void setup() {
		DBFTestBase dbftest = new DBFTestBase();
		dbftest.initialize();
	}
	
	@AfterTest
	public void closeApplication() {
		DBFTestBase dbftest = new DBFTestBase();
		dbftest.driver.quit();
		
	}

}
