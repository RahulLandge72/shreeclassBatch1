package Task;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllCmd3 {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		
	}
	@Test
	public void script() throws InterruptedException, IOException {

		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().back();
		//driver.navigate().forward();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement dropdown=driver.findElement(By.xpath("//select[@name='url']"));
		Select sel=new Select(dropdown);
		String totalValues=driver.findElement(By.xpath("//select[@name='url']")).getText();
		System.out.println(totalValues);
		//sel.selectByIndex(4);
		sel.selectByVisibleText("Books");
		System.out.println("Selected by me: "+sel.getFirstSelectedOption().getText());
		driver.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys("Marathi Novels"+Keys.ENTER);
		JavascriptExecutor js=(JavascriptExecutor)driver ;
		WebElement scrlpath=driver.findElement(By.xpath("//span[text()='Amrutvel (Marathi)']"));
		js.executeScript("arguments[0].scrollIntoView()", scrlpath);
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-3000)", "");
		driver.findElement(By.xpath("(//span[@style='visibility: visible;'])[1]")).click();
		TakesScreenshot ts= (TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		//File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String SSpath="C:\\Users\\Administrator\\OneDrive\\Desktop\\Activator Win\\javaeclip\\Auto\\ScreenShots";
		File dest=new File(SSpath+"\\sss.png");
		FileUtils.copyFile(src, dest);
		
		
	
	}
	@AfterMethod
	public void close() {
		driver.close();
	}
	

}
