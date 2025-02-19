package assertionsTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class hardAssertion {
	
	@Test
	public void webAppTest() {
		String expectedValue = "Vivek";
		String actualValue = "Vivek"; //Web Pages - Page Title, element text, API response
		
		System.out.println("Assertion Equal Demo");
		//Hard Assertion - all subsequent steps will not be executed.
		Assert.assertEquals(actualValue, expectedValue, "Custom message");
		
		System.out.println("After Assertion");
		
		String expected2 = "TestNGAssertions";
		String actual2 = "TestNGAssertionsDemo";
		
		System.out.println("Assertion Not Equal Demo");
		Assert.assertNotEquals(actual2, expected2, "Custom message to check Assert Not Equal");
		
		System.out.println("After Assertion2");
		
		String actual3= null;
		//String actual3= "NotNull";
		Assert.assertNull(actual3, "Assert message for assert null");
		System.out.println("After Assertion3");
		
		String actual4= "NotNull";
		Assert.assertNotNull(actual4,"Assert message for assert not null");
		System.out.println("After Assertion4");

	}

}
