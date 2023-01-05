package TestNg;

import org.testng.annotations.Test;

public class GroupsKeyword {
@Test(groups="sanity")
public void sanity() {
	System.out.println("sanity");

}
@Test(groups="sanity")
public void sanity2() {
	System.out.println("second sanity");
}
@Test(groups="regression")
public void regression() {
	
	System.out.println("regression");
}
@Test(groups="mix")
public void mix() {
	System.out.println("sanity + regression");
	
}
}
