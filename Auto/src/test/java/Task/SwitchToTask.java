package Task;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchToTask {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		WebElement Click_Here = driver.findElement(By.xpath("//a[text()='Click Here']"));
		Click_Here.click();
		
		Set<String> AllWindows = driver.getWindowHandles();
		System.out.println(AllWindows);
		
		Iterator<String> it = AllWindows.iterator();
		
		String partent = it.next();
		String child = it.next();
		driver.switchTo().window(child);
		
		String Email_Id = driver.findElement(By.xpath("//td[text()='Email ID']")).getText();
		System.out.println(Email_Id);
		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("Rahul@gmail.com");
		WebElement Sub_Button=driver.findElement(By.xpath("//input[@value='Submit']"));
		Sub_Button.click();

	}

}
