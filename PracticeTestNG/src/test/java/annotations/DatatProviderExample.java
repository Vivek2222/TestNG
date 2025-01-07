package annotations;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DatatProviderExample {
	
	@Test (dataProvider = "loginData")
	public void loginTestcase(String username, String password) {
		
		System.out.println("This is login testcase");
		System.out.println("Username is: "+username);
		System.out.println("Username is: "+password);

	}
	
	@DataProvider (name="loginData")
	public Object[][] dataprovidermethod(){
		
		return new Object[][] {
			{"user1", "password1"},
			{"user2", "password2"}
		};
	}
}
