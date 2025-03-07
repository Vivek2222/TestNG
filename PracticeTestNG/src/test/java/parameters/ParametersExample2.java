package parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ParametersExample2 {

	@Parameters({"username","password"})
	@Test
	public void loginTestcase(String username, String password) {

		System.out.println("This is login testcase");
		System.out.println("Username is: " + username);
		System.out.println("Username is: " + password);

	}

}
