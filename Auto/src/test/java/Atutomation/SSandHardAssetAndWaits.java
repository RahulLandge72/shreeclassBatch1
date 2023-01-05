package Atutomation;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SSandHardAssetAndWaits {

	WebDriver driver;

	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.functionize.com/demo");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void script() throws Exception {
		WebElement name = driver.findElement(By.xpath("//input[@name='firstname']"));
		name.sendKeys("Rahul");
		WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
		lastname.sendKeys("Landge");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("rahul@gmail.com");
	
		WebElement phone=driver.findElement(By.xpath("//input[@name='phone']"));
		if(phone.isDisplayed()) {
			phone.sendKeys("8262039056");
		}
		driver.findElement(By.xpath("//input[@name='company']")).sendKeys("shreeClass");
		WebElement DDjobrole=driver.findElement(By.xpath("//select[@name='job_role']"));
		Select sel=new Select(DDjobrole);
		sel.selectByVisibleText("QA Analyst");
		WebElement painpoint=driver.findElement(By.xpath("//select[@name='biggest_software_challenge']"));
		Select sel2=new Select(painpoint);
		sel2.selectByVisibleText("Moving testing to the Cloud");
		
		String actual=driver.getTitle();
		//System.out.println(actual);
		String expected="Intelligent Testing Demo";
		Assert.assertEquals(actual, "Intelligent Testing Demo");
		
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String path="C:\\Users\\Administrator\\OneDrive\\Desktop\\Activator Win\\javaeclip\\Auto\\ScreenShots";
		File dest=new File(path+"\\photo.png");
		FileUtils.copyFile(screenshot, dest);
		
		
		/*WebDriverWait wait=new WebDriverWait(driver,10);
wait.until((ExpectedConditions.invisibilityOfElementLocated(By.className("//input[@class='hs-button primary large']"))));
		driver.findElement(By.className("/input[@class='hs-button primary large']")).click();
				*/
		
	}

}
