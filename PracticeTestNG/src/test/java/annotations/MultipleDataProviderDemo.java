package annotations;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

//Check DataProviderExample2
public class MultipleDataProviderDemo {

	Object[][] obj = null;

	@DataProvider
	public Object[][] dataprovidermethod(Method m) {

		Object[][] obj = null;

		// if(m.getName().contentEquals("loginTestcase"))
		if (m.getName().contains("loginTestcase")) {
			obj = new Object[][] { { "user1", "password1" }, 
				{ "user2", "password2" } };
		}
		// else if(m.getName().contentEquals("profileInfo"))
		else if (m.getName().contains("profileInfo"))

			obj = new Object[][] { { "Ramo", "remo@mail.com", "Australia" },
					{ "Bradford", "eric@mail.com", "United States" }, 
					{ "Chen", "eric@mail.com", "United Kingdom" } };
		return obj;
	}

}
