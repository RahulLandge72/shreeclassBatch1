package TestNg;

import org.testng.annotations.Test;

public class KeywordPriority {
	@Test(priority=0)
	public void diff1() {
	System.out.println("------before priority-----");
	}
	@Test
	public void first() {
		System.out.println("first");
	}
@Test
public void second() {
	System.out.println("second");
}
@Test
public void third() {
	System.out.println("third");
	
}
@Test(priority=1)
public void diff() {
System.out.println("------after priority-----");
}
@Test (priority=3)
public void first1() {
	System.out.println("first1");
}
	
@Test (priority=2)
public void second2() {
System.out.println("second2");
}
@Test (priority=1)
public void third3() {
System.out.println("third3");

}

}
