package Task;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Totalcmd {
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://www.naukri.com/mnjuser/homepage");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	}
@Test
public void script() throws Exception {
	Actions act=new Actions (driver);
	WebElement job=driver.findElement(By.xpath("//a[@title='Search Jobs']"));
	act.moveToElement(job).build().perform();
	//Thread.sleep(5000);
	driver.findElement(By.xpath("//div[contains(text(),'Remote jobs')]")).click();
	
	driver.findElement(By.xpath("//button[text()='GOT IT']")).click();

	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	//js.executeScript("window.scrollBy(0,3000)", "");
	//Thread.sleep(2500);
	WebElement freshness=driver.findElement(By.xpath("//span[text()='Freshness']"));
	js.executeScript("arguments[0].scrollIntoView()", freshness);
	

	
	
}


}
