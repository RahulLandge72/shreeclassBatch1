package TestNgTasks;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert extends TaskBaseClass {
	@Test
	public void Hassert() {
		
		driver.get("https://www.facebook.com/");
		String actual_Title=driver.getTitle();
		String expected_Title="Facebook – log in or sign up";
		Assert.assertEquals(actual_Title, expected_Title);


		
		System.out.println(actual_Title);
		System.out.println(expected_Title);
		Assert.assertEquals(actual_Title, "123");
	}

}
