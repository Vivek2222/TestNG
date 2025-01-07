package annotations;

import org.testng.annotations.DataProvider;

//Check DataProviderExample2
public class DataProviderDemo {
	
	@DataProvider
	public Object[][] dataprovidermethod(){
		
		return new Object[][] {
			{"user1", "password1"},
			{"user2", "password2"}
		};
	}
	
	@DataProvider
	public Object[][] dataprovidermethod2(){
		
		return new Object[][] {
			{"Ramo", "remo@mail.com", "Australia"},
			{"Bradford", "eric@mail.com", "United States"},
			{"Chen", "eric@mail.com", "United Kingdom"}
		};
	}

}
