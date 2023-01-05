package Atutomation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class ScreenShots {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		// driver.manage().window().maximize();

		String rndms = RandomString.make(4);
		String path = "C:\\Users\\Administrator\\OneDrive\\Desktop\\Activator Win\\javaeclip\\Auto\\ScreenShots";
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);

		File dest = new File(path + "\\" + rndms + ".png");

		// File dest=new File(path+"\\fbLogin.png");
		FileUtils.copyFile(src, dest);
	}

}
