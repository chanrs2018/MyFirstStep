package SeleniumWebDriver;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class menuAndSubmenu {
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
		try
		{
			
		driver.get("http://techcanvass.com/");
		wait= new WebDriverWait(driver,30); 
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.partialLinkText("Courses"))).build().perform();
		WebElement element = wait
				.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Automation Testing Courses")));
		action.moveToElement(element).build().perform();
		WebElement list = wait
				.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Selenium Training")));
		list.click();
		Assert.assertTrue(wait.until(ExpectedConditions.titleIs("Selenium Training Centre, Selenium Online Course - Techcanvass")));
		

		}
		catch (Exception e)
		{ScreenShot.takesnap(driver, getClass().getName());
		Assert.fail(e.getLocalizedMessage());
		
		}
		}
		
		

}

