package TestNg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstEx {

	WebDriver driver;

	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void testscript() throws Exception {
		driver.get("https://www.nseindia.com/");
		WebElement NBar = driver.findElement(By.xpath("//a[text()='Invest']"));
		NBar.click();

		// Thread.sleep(5000);
		// driver.findElement(By.xpath("//a[text()='Investor Charter']")).click();

	}

	@Test
	public void testscript2() {
		driver.get("https://pixabay.com/");

		driver.findElement(By.xpath("(//input[@class='q'])[2]")).sendKeys("Apple" + Keys.ENTER);
		driver.close();
	}

	@AfterMethod
	public void close() {
		// driver.close();
	}
}
