package attributes_Part3;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;

public class NewTestDescription {
	
	//check the description on the index.xml on web browser
	
	@Test (description = "Test method one with description")
	public void testMethod_1() {
		System.out.println("This is Test Method 1");
	}

	@Test (description = "Test method two")
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

}
