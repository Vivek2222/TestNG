package parameters;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OptionalParameters {

	@Parameters("MessageKey")
	@Test
	public void testMethod(@Optional("Default message")String message) {
		System.out.println(message);
	}
}
