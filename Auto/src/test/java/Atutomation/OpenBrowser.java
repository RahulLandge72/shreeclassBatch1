package Atutomation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenBrowser {
public static void main(String[] args) {

	WebDriverManager.chromedriver().setup();
	ChromeDriver chrm=new ChromeDriver();
	chrm.get("https://www.amazon.com/");
	
	WebDriverManager.firefoxdriver().setup();
	FirefoxDriver frfx=new FirefoxDriver();
	frfx.get("https://www.wikipedia.org/");
	
}
}
