package Atutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dayy2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	 
		driver.findElement(By.className("suggestor-input")).sendKeys("Shree Class");		
	String url=driver.findElement(By.className("suggestor-input")).getText();
	System.out.println(url);
		String ok=driver.findElement(By.xpath("//div[text()='Search']")).getText();
		System.out.println(ok);
	String ko=driver.findElement(By.className("qsbSubmit")).getText();
		System.out.println(ko);
		
	}

}
