package SeleniumWebDriver;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practice {
	WebDriver driver;
	WebDriverWait wait;

	@Before

	public void setup() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
				//implicit wait
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		wait= new WebDriverWait(driver,10);

	}

	@Test

	public void testAlerts() throws InterruptedException {
		
		driver.get("file:///E:/Chandni/Html%20Demo/demo%20html/OpenNewWindow-NewTab.html");
		wait= new WebDriverWait(driver,30); 
		
		//step 1 Store current window handle
		
		String currentwindow= driver.getWindowHandle();
		
		// step 2: trigger new window/ tab/popup
		
		//driver.findElement(By.linkText("Click to open a new window")).click();
		driver.findElement(By.linkText("Click to open a new tab")).click();
		
		//step 3: get all active window handles
		
		Set<String> windowhandles= driver.getWindowHandles();
		
		//step 4: switch to appropriate window
		
		for (String window : windowhandles) {
			if (!currentwindow.equals(window)) {
				
				driver.switchTo().window(window);
				driver.manage().window().maximize();
				break;
			}
			
				}
		// step 5- interact with new window
					Assert.assertEquals("This is a new tab.",wait
							.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("body > center > h1"))).getText());
			
		
		
		
		
		
		
		
		

		
		
		

}
}
