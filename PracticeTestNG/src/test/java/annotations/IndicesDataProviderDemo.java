package annotations;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

//Check IndicesDataProviderExample
public class IndicesDataProviderDemo {

	
	@DataProvider(indices = {0,2})//Blank value consider as All
	public Object[][] dataprovidermethod(Method m) {

		Object[][] obj = null;

		 if(m.getName().contentEquals("loginTestcase")) {
			obj = new Object[][] { 
				{ "user1", "password1" }, 
				{ "user2", "password2" },
				{ "user3", "password3" } 
			};
		}
	    else if(m.getName().contentEquals("profileInfo")) {

			obj = new Object[][] { 
					{ "Ramo", "remo@mail.com", "Australia" },
					{ "Bradford", "eric@mail.com", "United States" }, 
					{ "Chen", "eric@mail.com", "United Kingdom" } 
			};
	    }
		return obj;
	}
}
