package annotations;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderParallel {
	
	@Test(dataProvider = "dataProvider")
	public void testMethods(String username, String password) {
		System.out.println(username);
		System.out.println(password);
	}
	@DataProvider (parallel = true)
	public Object[][] dataProvider() {
		String[][] str = new String[][] { 
			{ "User1", "Password1" }, 
			{ "User2", "Password2" }, 
			{ "User3", "Password3" },
			{ "User4", "Password4" }, 
			{ "User5", "Password5" } 
			};
		return str;
	}

}
