package Task;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllCmd2 {

	WebDriver driver;
	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.ibef.org/industry/healthcare-india");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	}
	@Test
	public void test() throws Exception {
		
		WebElement DropDown=driver.findElement(By.xpath("//select[@onchange='location.href = this.value']"));
		Select sel=new Select(DropDown);
		System.out.println(sel.getFirstSelectedOption().getText());
		//System.out.println(sel.getOptions().size());
		//String totaloptions=driver.findElement(By.xpath("//select[@onchange='location.href = this.value']")).getText();
		//System.out.println(totaloptions);
	
			List<WebElement>list =	sel.getOptions();
		System.out.println(list.size());
		for (int i=0; i<list.size();i++) {
		
			String value=list.get(i).getText();
			
			System.out.println(value);
			
			
			//sel.selectByVisibleText("IT & BPM");
			
		/*	if(value.equals("IT & BPM")) {
				sel.selectByVisibleText("IT & BPM");
				break;
			}*/
		}
		
	
		
	}
	
}
