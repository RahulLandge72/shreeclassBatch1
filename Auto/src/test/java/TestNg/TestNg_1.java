package TestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNg_1 {
	
	@BeforeSuite
	public void BS() {		
		System.out.println("BS");
	}
@BeforeTest
public void BT() {	
	System.out.println("BT");
}
@BeforeClass
public void BC() {
	System.out.println("BC");
}
@BeforeMethod
public void BM() {
	System.out.println("BM");
}

@Test
public void test_1() {
	System.out.println("Test_No_1");
}

@Test
public void test_2() {
	System.out.println("Test_No_2");
}
@Test
public void test_3() {
	System.out.println("Test_No_3");
}


@AfterMethod
public void AM() {
	System.out.println("AM");
}
@AfterClass
public void AC() {
	System.out.println("AC");
}
@AfterTest
public void AT() {
	System.out.println("AT");
}
@AfterSuite
public void AS() {
	System.out.println("AS");
}

	
}
