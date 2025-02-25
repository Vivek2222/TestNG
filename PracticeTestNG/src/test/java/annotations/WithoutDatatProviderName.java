package annotations;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WithoutDatatProviderName {
	
	@Test (dataProvider = "dataprovidermethod")
	public void loginTestcase(String username, String password) {
		
		System.out.println("This is login testcase");
		System.out.println("Username is: "+username);
		System.out.println("Username is: "+password);

	}
	
	@DataProvider
	public Object[][] dataprovidermethod(){
		
		return new Object[][] {
			{"user1", "password1"},
			{"user2", "password2"}
		};
	}
}
