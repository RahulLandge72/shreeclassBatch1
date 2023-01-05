package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollTask2 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		WebElement ddown = driver.findElement(By.xpath("//select[@name='url']"));
		Select books = new Select(ddown);
		Thread.sleep(2000);
		
		books.selectByVisibleText("Books");
		
		WebElement SearchTab = driver.findElement(By.xpath("//input[@type='text']"));
		SearchTab.sendKeys("Mrutunjay Marathi");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='MRUTYUNJAY (Marathi)']")).click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,10000)", "");
		Thread.sleep(1000);

		WebElement find = driver.findElement(By.xpath("//i[text()='Amazon Whispernet']"));
		js.executeScript("arguments[0].scrollIntoView()", find);
		
		driver.findElement(By.xpath("//input[@id='one-click-button']")).click();
	}

}
