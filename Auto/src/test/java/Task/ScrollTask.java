package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollTask {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		WebElement SearchTab = driver.findElement(By.xpath("//input[@type='text']"));
		SearchTab.sendKeys("redmi 8 Pro");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("(//img[@class='s-image'])[1]")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,8000)", "");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-8000)", "");

		Thread.sleep(2000);
		WebElement find = driver.findElement(By.xpath("//input[@name='submit.addToCart']"));
		js.executeScript("arguments[0].scrollIntoView()", find);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='submit.addToCart']")).click();
		String result = driver.findElement(By.xpath("//span[contains(text(),'Added to Cart')]")).getText();
		System.out.println(result);
		Thread.sleep(1000);
		driver.close();

	}

}
