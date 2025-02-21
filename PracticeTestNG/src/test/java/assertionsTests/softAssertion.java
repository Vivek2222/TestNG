package assertionsTests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssertion {
	
	@Test
	public void webAppTest() {
		
		SoftAssert softAssert = new SoftAssert();
		String expectedValue = "Vivek";
		String actualValue = "Vivek"; //Web Pages - Page Title, element text, API response
		
		System.out.println("Assertion Equal Demo");
		//Soft Assertion - all subsequent steps will be executed and not skipped, even if we have any failure in the middle.
		softAssert.assertEquals(actualValue, expectedValue, "Custom message");
		
		System.out.println("After Assertion");
		
		String expected2 = "TestNGAssertions";
		String actual2 = "TestNGAssertionsDemo";
		
		System.out.println("Assertion Not Equal Demo");
		softAssert.assertNotEquals(actual2, expected2, "Custom message to check Assert Not Equal");
		
		System.out.println("After Assertion2");
		
		String actual3= null;
		//String actual3= "NotNull";
		softAssert.assertNull(actual3, "Custom message for assert null");
		System.out.println("After Assertion3");
		
		String actual4= "softAssertion";
		softAssert.assertNotNull(actual4,"Assert message for assert not null");
		System.out.println("After Assertion4");
		
		softAssert.assertAll();

	}

}
