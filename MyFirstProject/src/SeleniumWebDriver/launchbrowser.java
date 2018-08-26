package SeleniumWebDriver;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchbrowser {

	WebDriver driver;

	@Before

	public void setup() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/resources/chromedriver.exe");
		driver = new ChromeDriver();

	}

	@Test

	public void launch() {
		driver.get("http://google.com");
	}

	@After

	public void teardown() {
		driver.close();

	}
}
