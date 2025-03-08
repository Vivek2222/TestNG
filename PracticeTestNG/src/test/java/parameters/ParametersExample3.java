package parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersExample3 {
	
	@Parameters({"name1","email1", "address1"})
	@Test
	public void profileInfo(String name, String email, String address) {

		System.out.println("This is Profile Info testcase");
		System.out.println("Name is: " + name);
		System.out.println("Email is: " + email);
		System.out.println("Address is: " + address);
	}

}
