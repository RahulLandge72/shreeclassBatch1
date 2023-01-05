package Atutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ddwnguru {
	public static void main(String[] args) {
		Attribute R = new Attribute();

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input[@size='20'])[1]")).sendKeys("Rahul");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Landge");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(R.mobile);
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(R.mail);
		WebElement Address = driver.findElement(By.xpath("//input[@name='address1']"));
		Address.sendKeys(R.address);
		WebElement City = driver.findElement(By.xpath("//input[@name='city']"));
		City.sendKeys("Aurangabad");
		WebElement State = driver.findElement(By.xpath("//input[@name='state']"));
		State.sendKeys("Maharashtra");
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("431001");
		WebElement DropDown = driver.findElement(By.xpath("//select[@name='country']"));
		Select select = new Select(DropDown);
		select.selectByVisibleText("INDIA");
		WebElement user_name = driver.findElement(By.xpath("//input[@id='email']"));
		user_name.sendKeys(R.guruid);
		WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys(R.gurupass);
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys(R.gurupass);
		driver.findElement(By.xpath("//input[@name='submit']")).click();
	WebElement t=	driver.findElement(By.xpath("//b[contains(text(),' Note: Your user name is Rahul123.')]"));
	System.out.println(t.getText()); 
		

	}

}
