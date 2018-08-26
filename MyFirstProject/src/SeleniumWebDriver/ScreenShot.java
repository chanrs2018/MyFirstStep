package SeleniumWebDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {
	
	public static void takesnap(WebDriver driver,String filename) {
		
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File output = new File(System.getProperty("user.dir") + "/target/failures/"+filename+".jpg");
		try {
			FileUtils.copyFile(src, output);
		}
		
		catch (IOException e)
		{e.printStackTrace();
		}
		
		
	}

}
