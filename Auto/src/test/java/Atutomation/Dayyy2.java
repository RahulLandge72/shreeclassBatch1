package Atutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dayyy2 {

	public static void main(String[] args) throws InterruptedException {

Attribute r = new Attribute(); // he mi dusrya class mdhil values(id,password) call krnyasathi tya class cha object create kela

		WebDriverManager.chromedriver().setup(); //chrome driver set up kela
		WebDriver driver = new ChromeDriver(); // calling sathi refference create kela
		driver.get("https://www.facebook.com/"); // by using 'get' url call keli
		Thread.sleep(1000);						// 1000mili sec sathi wait dila
		driver.manage().window().maximize();	// window max keli
		String url = driver.getTitle();			// string la return (url) type provide krun gettitle call keli
		System.out.println(url);				//confirmation sathi url print keli
		WebElement log = driver.findElement(By.xpath("//input[@id='email']")); // login cha X-path set kela
		if (log.isEnabled()) { // if condition sathi web element use karava lagla
			log.sendKeys(r.fbid); // ithe keys mhanje value provide kelya.
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(r.fbpass); // without WebElement direct value provide keli
		String login = driver.findElement(By.name("login")).getText(); // ithe by using name gettext kel string mdhe store kela
		System.out.println(login); // string cha reference use krun text print kela
		Thread.sleep(1000);
		String link = driver.findElement(By.xpath("//a[text()='Forgotten password?']")).getText(); //gettext method use keli
		System.out.println(link);

		Thread.sleep(1000);
		WebElement logbutton = driver.findElement(By.xpath("//button[@value='1']"));
		logbutton.click();
		Thread.sleep(8000);
		driver.close();
		
		
		
		
		
		/*  WebElement createAC =driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]"));

		  driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")); // ithe contains text use keli
		  System.out.println(createAC.getText()); createAC.click();*/
		 

	}
}
