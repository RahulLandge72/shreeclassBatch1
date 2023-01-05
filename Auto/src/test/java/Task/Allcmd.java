package Task;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Allcmd {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://irctc.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement scrl = driver.findElement(By.xpath("//a[text()=' Air Ticketing ']"));
		js.executeScript("arguments[0].scrollIntoView()", scrl);
		driver.findElement(By.xpath("//a[text()=' Air Ticketing ']")).click();

		Set<String> s = driver.getWindowHandles();
		System.out.println(s);
		Iterator<String> it = s.iterator();
		String parent_Window = it.next();
		String child_window = it.next();
		driver.switchTo().window(child_window);

		WebElement checkbx = driver.findElement(By.xpath("//input[@id='ltc']"));
		checkbx.click();
		WebElement textbx1 = driver.findElement(By.xpath("//input[@name='From']"));
		System.out.println(textbx1.getAttribute("placeholder"));
		textbx1.sendKeys("mum");
		driver.findElement(By.xpath("//div[text()='Mumbai (BOM)']")).click();
		driver.switchTo().window(parent_Window);
		js.executeScript("window.scrollBy(0,-10000)", "");
		
		//driver.switchTo().window(child_window);
		Actions act=new Actions(driver);
	}
		
		

	}


