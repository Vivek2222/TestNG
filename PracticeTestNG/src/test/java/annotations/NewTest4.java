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

public class NewTest4 {
	@Test
	public void testMethod_1() {
		System.out.println("This is Test Method 1");
	}

	@Test
	public void testMethod_2() {
		System.out.println("This is Test Method 2");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This is Before Method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("This is After Method");

	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("This is Before Class");

	}

	@AfterClass
	public void afterClass() {
		System.out.println("This is After Class");

	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("This is Before Test annotation Method");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("This is After Test annotation Method");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("This is Before Suite Method");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("This is After Suite Method");
	}

}
