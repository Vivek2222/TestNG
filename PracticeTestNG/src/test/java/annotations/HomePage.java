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

public class HomePage {
	@Test
	public void HomePageTestCase1() {
		System.out.println("HomePageTest Method One");
	}
	@Test
	public void HomePageTestCase2() {
		System.out.println("HomePageTest Method Two");
	}
	@Test
	public void HomePageTestCase3() {
		System.out.println("HomePageTest Method Three");
	}
	@Test
	public void HomePageTestCase4() {
		System.out.println("HomePageTest Method Four");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method - HomePageTest");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method - HomePageTest");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class - HomePageTest");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After Class - HomePageTest");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test - HomePageTest");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("Before Class - HomePageTest");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite - HomePageTest");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite - HomePageTest");
	}
}
