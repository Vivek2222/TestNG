package annotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

//Before Class and After Class

public class NewTest2 {
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

}
