package annotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class LoginPage {
	@Test
	public void LoginTestCase1() {
		System.out.println("LoginTest Method One");
	}
	@Test
	public void LoginTestCase2() {
		System.out.println("LoginTest Method Two");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method - Login Test");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method - Login Test");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class - Login Test");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After Class - Login Test");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test - Login Test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("Before Class - Login Test");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite - Login Test");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite - Login Test");
	}
}
