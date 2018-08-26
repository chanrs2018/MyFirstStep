package com.techcanvass.webdriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingWindowsAndPopups {

	WebDriver driver;
	WebDriverWait wait;

	@Before
	public void setup() {
		// Initialising chrome browser
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// initializing explicit wait object
		wait = new WebDriverWait(driver, 10);
	}

	@Test
	public void testAlerts() throws InterruptedException {
		try {
			driver.get("file:///F:/selenium/demo%20html/OpenNewWindow-NewTab.html");

			// step 1: store current window handle:
			String currentWindow = driver.getWindowHandle();

			// step 2: trigger new window/ tab/ popup
			driver.findElement(By.linkText("Click to open a new window")).click();

			// step 3: get all window handles
			Set<String> windowHandles = driver.getWindowHandles();

			// Step 4: switch to the appropriate window:

			for (String window : windowHandles) {
				if (!currentWindow.equals(window)) {
					driver.switchTo().window(window);
					driver.manage().window().maximize();
					break;
				}
			}
			// Step 5: interact with new window/ tab
			Assert.assertEquals("This is a new window.",
					wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("body > center > h1")))
							.getText());
		} catch (Exception e) {

			Screenshot.takesnap(driver, getClass().getSimpleName());
			Assert.fail(e.getMessage());
			
		}
	}

	@After
	public void tearDown() {
		driver.quit();
	}

}
