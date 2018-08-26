package SeleniumWebDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot(2) {

	public static void takesnap(WebDriver driver, String fileName) {

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		File output = new File(System.getProperty("user.dir") + "/target/failures/" + fileName + ".jpg");
		try {
			FileUtils.copyFile(src, output);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
