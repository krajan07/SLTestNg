package TestSuite1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC1 {
	
	@BeforeGroups("Sanity")
	public void BeforeGroupSanity() {
		System.out.println("Before Groups Sanity");
	}
	
	@BeforeGroups("Regression")
	public void BeforeGroupRegression() {
		System.out.println("Before Groups Regression");
	}
	
	@BeforeTest
	public void BeforeTestMethod() {
		System.out.println("Before Method");
	}
	
	@BeforeMethod
	public void SetUp() {
		System.out.println("Setup");
	}
	
	@Test(groups= {"Sanity"},priority=1)
	public void LoginValidTest() {
		System.out.println("Inside the Login Test 1");
	}
	
	@Test(groups= {"Regression"})
	public void LoginInvalidTest() {
		System.out.println("Inside the Login Test 2");
	}
	
	@Test(groups= {"Sanity"},priority=0)
	public void SignUpValid() {
		System.out.println("Inside the Login Test 3");
	}
	
	
	@AfterMethod
	public void CleanUp() {
		System.out.println("CleanUp");
	}
	
	@AfterTest
	public void AfterTestMethod1() {
		System.out.println("After Method");
	}
}