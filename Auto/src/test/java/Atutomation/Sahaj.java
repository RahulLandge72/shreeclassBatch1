package Atutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sahaj {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement DropDown=driver.findElement(By.xpath("//select[@name='country']"));
		Select select=new Select (DropDown);
	//	System.out.println(	select.getFirstSelectedOption().getText());
		select.selectByIndex(4);
		//select.getFirstSelectedOption().getText();

		System.out.println(	select.getFirstSelectedOption().getText());

	}

}
