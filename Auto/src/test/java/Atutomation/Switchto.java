package Atutomation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Switchto {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		WebElement SecondWindow = driver.findElement(By.xpath("//div[text()='Services']"));
		SecondWindow.click();
		Set<String> Allwindows = driver.getWindowHandles();
		System.out.println(Allwindows);
	
		Iterator<String> it = Allwindows.iterator();
		String parent = it.next();
		String child = it.next();
	
		driver.switchTo().window(child);

		WebElement Name = driver.findElement(By.xpath("(//input[@id='name'])[2]"));
		Name.sendKeys("Rahul");
		WebElement email = driver.findElement(By.xpath("(//input[@id='email'])[2]"));
		email.sendKeys("Rahul@gmail.com");
		String s = driver.findElement(By.xpath("(//input[@id='mobile'])[2]")).getAttribute("placeholder");
		System.out.println(s);
		driver.findElement(By.xpath("(//input[@id='mobile'])[2]")).sendKeys("9797979797");
		WebElement message = driver.findElement(By.xpath("//input[@id='message']"));
		message.sendKeys("This website is very difficult to find x-path");
		

		// driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
