package Atutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Trello {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://trello.com/en/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='user']")).sendKeys("treello321@gmail.com");
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Rr674332");
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		

		driver.findElement(By.xpath("//p[text()='Create']")).click();
		driver.findElement(By.xpath("//span[text()='Create board']")).click();
		
	WebElement BoardTitle=	driver.findElement(By.xpath("//input[@aria-invalid='true']"));
		BoardTitle.sendKeys("Sarika Board ");
		driver.findElement(By.xpath("//button[text()='Create']")).click();
		driver.findElement(By.xpath("//input[@class='list-name-input']")).sendKeys("List A");
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		
		driver.findElement(By.xpath("//input[@class='list-name-input']")).sendKeys("List B");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		driver.findElement(By.xpath("(//span[@class='js-add-a-card'])[1]")).click();
		driver.findElement(By.xpath("//textarea[@class='list-card-composer-textarea js-card-title']")).sendKeys("Card A");
		driver.findElement(By.xpath("//input[@value='Add card']")).click();

		driver.findElement(By.xpath("//a[@aria-label='Cancel list editing']")).click();
		
		Actions Act =new Actions(driver);
		WebElement drag=driver.findElement(By.xpath("//span[@class='list-card-title js-card-name']"));
		WebElement drop =driver.findElement(By.xpath("(//div[@class='list-header-target js-editing-target'])[2]"));
		
		Act.dragAndDrop(drag, drop).build().perform();
		
		WebElement from1=driver.findElement(By.xpath("//span[@class='list-card-title js-card-name']"));
		Point Cord=from1.getLocation();
		int XCord=Cord.getX();
		int YCord=Cord.getY();
		System.out.println("X-coordinate = "+XCord +" , "+"Y-coordinate = "+YCord);
		
		driver.findElement(By.xpath("//span [@title='rahul (treello321)']")).click();
		driver.findElement(By.xpath("(//button[@class='R2Zt2qKgQJtkYY'])[3]")).click();
		
		

	}

}
