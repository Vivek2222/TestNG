package attributes_Part3;

import org.testng.TestNGException;
import org.testng.annotations.Test;

public class ExpectedExceptionsExample {

	@Test (expectedExceptions = {NullPointerException.class, TestNGException.class})
	public void testMethod() {
		System.out.println("Test Method for Expected Exceptions");
	}
}
