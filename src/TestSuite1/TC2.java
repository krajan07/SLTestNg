package TestSuite1;

import org.testng.annotations.Test;

public class TC2 {
	@Test(groups= {"Sanity"},priority=1,dependsOnMethods="HomePage3")
	public void HomePage1() {
		System.out.println("Inside Home Page 1");
	}
	
	@Test(dependsOnMethods="HomePage3",groups= {"Sanity"},priority=0)
	public void HomePage2() {
		System.out.println("Inside Home Page 2");
	}
	
	@Test(groups= {"Sanity"},priority=1)
	public void HomePage3() {
		System.out.println("Inside Home Page 3");
	}
}