package TestNg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElements {
// he purn baki aahe auto suggesions ahe he
	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("twitter");

		Thread.sleep(5000);

		
		List<WebElement> List=driver.findElements(By.xpath("//div[@jsname='aajZCb']/div"));

		System.out.println(List.size());
		System.out.println(List.get(0).getText());
	}

}
