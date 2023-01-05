package Task;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframe {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.switchTo().frame("moneyiframe");
		WebElement field = driver.findElement(By.xpath("//input[@placeholder='Enter company or MF']"));
		field.sendKeys("JIO");
		driver.findElement(By.xpath("//input[@placeholder='Enter company or MF']")).sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		Set<String> window = driver.getWindowHandles();
		System.out.println(window);
		Iterator<String> it = window.iterator();
		String parent = it.next();
		String child = it.next();
		driver.switchTo().window(child);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement path = driver.findElement(By.xpath("//h4[text()='Investment tracking']"));
		js.executeScript("arguments[0].scrollIntoView()", path);
		String text=driver.findElement(By.xpath("(//a[text()='My Portfolio'])[2]")).getText();
		System.out.println(text);
		Thread.sleep(1500);
		driver.switchTo().window(parent);

	}

}
