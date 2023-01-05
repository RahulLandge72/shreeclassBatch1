package Atutomation;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TextBx {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
		WebElement radioButton = driver.findElement(By.xpath("//input[@value='Option 1']"));
		radioButton.click();
		driver.findElement(By.xpath("//input[@value='Option 2']")).click();
		WebElement radioButton3 = driver.findElement(By.xpath("//input[@value='Option 3']"));
		if (!radioButton3.isEnabled()) {
			radioButton3.click();
		} else {
			System.out.println("   radio button is enabled");
		}
		WebElement chckbx1 = driver.findElement(By.xpath("//input[@value='checkbox1']"));
		chckbx1.click();
		WebElement chckbx2 = driver.findElement(By.xpath("//input[@value='checkbox2']"));
		if (chckbx2.isDisplayed()) {
			chckbx2.click();
		}
		WebElement chckbx3 = driver.findElement(By.xpath("//input[@value='checkbox3']"));
		if (!chckbx3.isSelected()) {
			chckbx3.click();
		}

	}

}
