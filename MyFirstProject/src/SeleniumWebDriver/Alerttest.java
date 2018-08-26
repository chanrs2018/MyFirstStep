package SeleniumWebDriver;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerttest {
	
	
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
		driver.get("http://output.jsbin.com/usidix/1");


		driver.findElement(By.xpath("/html/body/input")).click();
		
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
		
		
		
		
		
		
}
}
