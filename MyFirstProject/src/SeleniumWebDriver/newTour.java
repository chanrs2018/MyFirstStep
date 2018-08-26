package SeleniumWebDriver;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class newTour {
	
	WebDriver driver;
	WebDriverWait wait;

	@Before

	public void setup() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@Test

	public void launch() {
		driver.get("http://techcanvass.com/feedback.aspx");
		
		WebElement course = driver.findElement(By.name("ddlSubject"));
		Select select = new Select(course);
		select.selectByValue("Mobile Testing with Appium");
	
		driver.findElement(By.name("txtName")).sendKeys("Demo");
		driver.findElement(By.name("txtMessage")).sendKeys("This is a practice class for selenium");
	
	}
}
