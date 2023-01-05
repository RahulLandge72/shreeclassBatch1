package Atutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Programcomments {

	public static void main(String[] args) throws InterruptedException { 
		WebDriverManager.chromedriver().setup(); // this is a casting for chromedriver. mhnje chrmdriver setup kela
		WebDriver driver = new ChromeDriver();   // ithe reffernce create kela
		driver.get("https://www.amazon.com/"); // ithe url call keli
		driver.manage().window().maximize(); 
		Thread.sleep(2000);
		driver.navigate().to("https://en.wikipedia.org/wiki/Harry_Potter");
		Thread.sleep(5000);

		driver.close(); 

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://www.wikipedia.org/");
		Thread.sleep(2000);

		String url = driver.getTitle();
		System.out.println(url);
		driver.get("https://in.bookmyshow.com/explore/home/aurangabad");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.navigate().refresh();
		driver.quit();

	}

}
