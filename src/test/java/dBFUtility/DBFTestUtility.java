package dBFUtility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class DBFTestUtility extends DBFTestBase{
	public static long implicitly_Wait = 20;
	public static long pageLoad_Timeout = 20;
	
	public static void takeScreenShot(WebDriver driver, String screenShot) {
		File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String currentdir = System.getProperty("user.dir");
		
			try {
				FileUtils.copyFile(srcfile, new File(currentdir+ "/AboutUsScreenShots/" + screenShot+".png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		
	}


}
