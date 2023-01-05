package Atutomation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouceActions {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)", "");

		Actions act = new Actions(driver);

		WebElement amt = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement amtplace = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		act.dragAndDrop(amt, amtplace).build().perform();
		Thread.sleep(2000);
		WebElement bank = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement bankplace = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		act.dragAndDrop(bank, bankplace).build().perform();
		Thread.sleep(2000);
		WebElement newclick = driver.findElement(By.xpath("//a[text()='Insurance Project']"));
		act.moveToElement(newclick).click().build().perform();
		Thread.sleep(6000);
		
	}

}
