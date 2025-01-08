package annotations;

import org.testng.annotations.Test;

public class DatatProviderExample2 {
	
	@Test (dataProvider = "dataprovidermethod",dataProviderClass = DataProviderDemo.class)
	public void loginTestcase(String username, String password) {
		
		System.out.println("This is login testcase");
		System.out.println("Username is: "+username);
		System.out.println("Username is: "+password);
	}
	
	@Test (dataProvider = "dataprovidermethod2",dataProviderClass = DataProviderDemo.class)
	public void profileInfo(String name, String email, String address) {
		
		System.out.println("This is Profile Info testcase");
		System.out.println("Name is: "+name);
		System.out.println("Email is: "+email);
		System.out.println("Address is: "+address);
	}
	
}
