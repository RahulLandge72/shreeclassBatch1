package Atutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.github.dockerjava.core.exec.ListNetworksCmdExec;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropDown {

	public static void main(String[] args) throws Throwable {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/newtours/register.php");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Rahul");
	driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Landge");
	driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Rahul@123");
	/*String s=driver.findElement(By.xpath("//select[@name='country']")).getText();
	 System.out.println(s);*/ 
	WebElement DropDown=driver.findElement(By.xpath("//select[@name='country']"));
	Select select=new Select (DropDown);
	System.out.println(	select.getFirstSelectedOption().getText());

	select.selectByIndex(4);
	select.getFirstSelectedOption().getText();
	System.out.println(	select.getFirstSelectedOption().getText());

	select.selectByValue("ASHMORE AND CARTIER ISLANDS");
	select.selectByVisibleText("ALGERIA");
	//select.getOptions().size();
	//System.out.println(	select.getOptions().size());
List<WebElement> list=select.getOptions();
System.out.println(list.size());
for (int i=0;i<list.size();i++) {
	String value=list.get(i).getText();
	System.out.println(value);
	
}
	}

}
