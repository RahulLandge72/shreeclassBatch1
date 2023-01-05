package Atutomation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("123");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		Alert alt=driver.switchTo().alert();
		
		System.out.println(alt.getText());		
		alt.accept();
		
		Thread.sleep(1000);
	
		System.out.println(alt.getText());		
		alt.accept();
		
		driver.close();
	}

}
