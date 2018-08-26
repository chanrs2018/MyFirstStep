package com.techcanvass.webdriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tables {

	WebDriver driver;
	WebDriverWait wait;
	String state = "Maharashtra";

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

	//@Test
	public void testAlerts() throws InterruptedException {
		try {
			driver.get("file:///F:/selenium/demo%20html/SampleTable.html");
			// step 1 get the table element
			WebElement table = driver.findElement(By.tagName("table"));
			// step 2 : get all rows
			List<WebElement> rows = table.findElements(By.tagName("tr"));
			// step 3 fetch columns from each row
			for (WebElement row : rows) {
				List<WebElement> columns = row.findElements(By.tagName("td"));
				for (WebElement header : columns) {
					System.out.println(header.getText());
				}
			}

		} catch (Exception e) {

			Screenshot.takesnap(driver, getClass().getSimpleName());
			Assert.fail(e.getMessage());

		}
	}

	@Test
	public void getRank() {
		driver.get("file:///F:/selenium/demo%20html/SampleTable.html");

		String rank = driver.findElement(By.xpath("//a[text()='" + state + "']/../preceding-sibling::td[1]")).getText();
		System.out.println(" Rank of state "+state+" in terms of population :"+rank);
	}

	@After
	public void tearDown() {
		driver.quit();
	}

}
