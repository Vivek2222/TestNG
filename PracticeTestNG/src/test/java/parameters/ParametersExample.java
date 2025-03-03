package parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersExample {

	@Parameters("MessageKey")
	@Test
	public void testMethod(String message) {
		System.out.println(message);
	}
}
