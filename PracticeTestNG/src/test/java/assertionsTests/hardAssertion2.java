package assertionsTests;

import static org.testng.Assert.*;

import org.testng.Assert;
import org.testng.annotations.Test;

public class hardAssertion2 {
	
	@Test
	public void webAppTest() {
		String expectedValue = "Vivek";
		String actualValue = "Vivek"; //Web Pages - Page Title, element text, api response
		
		System.out.println("Assertion Equal Demo");
		//Hard Assertion
		assertEquals(actualValue, expectedValue, "Custom message");
		
		System.out.println("After Assertion");
		
		String expected2 = "TestNGAssertions";
		String actual2 = "TestNGAssertionsDemo";
		
		System.out.println("Assertion Not Equal Demo");
		assertNotEquals(actual2, expected2, "Custom message to check Assert Not Equal");
		
		System.out.println("After Assertion2");
		
		String actual3= null;
		//String actual3= "NotNull";
		assertNull(actual3, "Assert message for assert null");
		System.out.println("After Assertion3");
		
		String actual4= "NotNull";
		assertNotNull(actual4,"Assert message for assert not null");
		System.out.println("After Assertion4");

	}

}
