package Atutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		String s = driver.findElement(By.xpath("//*[@id=\'email\']")).getAttribute("placeholder");
		System.out.println(s);
		// driver.close();

		// driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		// driver.navigate().back();
		// Thread.sleep(2000);
		// String url=driver.getTitle();
		// System.out.println(url);
		// driver.quit();
		/////////// driver.findElement(By.xpath("//input[@class='suggestor-input
		// ']")).sendKeys("lkj");

	}

}
