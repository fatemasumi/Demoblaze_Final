package dBFUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DBFTestBase {
	
	public static Properties prop;
	public static WebDriver driver;
	
	public DBFTestBase() {
		prop = new Properties();
		try {
			FileInputStream files = new FileInputStream(System.getProperty("user.dir")+ "\\src\\test\\java\\dBFConfig\\DBFConfig.properties");
			prop.load(files);
		} catch (FileNotFoundException e) {
			System.out.println("check your constructor");
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}

	}
	public void initialize() {
		String browser = prop.getProperty("Browser1");
		if (browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\ChromeDriver\\chromedriver.exe");
			driver = new ChromeDriver();//create odject of the WebDrivver
			driver.manage().timeouts().implicitlyWait(DBFTestUtility.implicitly_Wait, TimeUnit.SECONDS); //Wait time given for opening browser
			driver.manage().timeouts().pageLoadTimeout(DBFTestUtility.pageLoad_Timeout, TimeUnit.SECONDS);//Wait time given for loading browser
			driver.manage().deleteAllCookies();//deleting cookies
			driver.manage().window().maximize();//maximizing browse
		}
		else if (browser.equals("IE")) {
			System.setProperty("webdriver.edge.driver",  System.getProperty("user.dir")+ "\\Edge Driver\\msedgedriver.exe");
			WebDriver driver = new EdgeDriver(); //create odject of the WebDrivver
			driver.manage().timeouts().implicitlyWait(DBFTestUtility.implicitly_Wait, TimeUnit.SECONDS); //Wait time given for opening browser
			driver.manage().timeouts().pageLoadTimeout(DBFTestUtility.pageLoad_Timeout, TimeUnit.SECONDS);//Wait time given for loading browser
			driver.manage().deleteAllCookies();//deleting cookies
			driver.manage().window().maximize();//maximizing browse
		}
		
	}	
	
	public static void launchApplication(String URL) {
		driver.get(prop.getProperty("URL")); //Launch url key from config file 
		DBFTestUtility.takeScreenShot(driver, "loginPage");
		
	}


}
