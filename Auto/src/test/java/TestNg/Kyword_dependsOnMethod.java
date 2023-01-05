package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Kyword_dependsOnMethod {
	
	@Test()
	public void first() {
		System.out.println("first");
		//Assert.assertTrue(false);
	}
	@Test (dependsOnMethods="first")// jar fist test case fail zali tr hi run honar nahi
	public void second() {// karan ithe aapn dependsOnMethods use kelay
		System.out.println("second");
		
	}
	
	
	

}
