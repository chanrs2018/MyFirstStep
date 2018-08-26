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

public class seleniumcommands {
	
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
		driver.get("http://toolsqa.com/automation-practice-form/");
		wait= new WebDriverWait(driver,10);
		WebElement continents= wait.until(ExpectedConditions.elementToBeClickable(By.id("continents")));
		Select select= new Select(continents);
		select.selectByVisibleText("South America");
		
		wait= new WebDriverWait(driver,30);
		
		WebElement comboBox = driver.findElement(By.id("selenium_commands"));
		select = new Select(comboBox);
		select.selectByIndex(1);
		select.selectByVisibleText("WebElement Commands");
		wait= new WebDriverWait(driver,10);
		
		select.deselectByIndex(1);
		
		
		
		
		
	}
    
	
	
}
