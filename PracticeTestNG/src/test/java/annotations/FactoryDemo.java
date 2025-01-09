package annotations;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class FactoryDemo {
	
	private String str;
	FactoryDemo(String pageName) {
		str=pageName;
	}
	
	
	@Test
	public void SampleTest1(){
		 System.out.println("This is Sample Test Method 1: "+str);
	}
	@Test
	public void SampleTest2(){
		 System.out.println("This is Sample Test Method 2: "+str);
	}
	
	//Without annotation testNG cannot consider it for execution
	@Factory
	public Object[] factoryRun(){
		return new Object[] { new FactoryDemo("Login"),
				new FactoryDemo("Home"),
				new FactoryDemo("Cart"),
				new FactoryDemo("Checkout")};
	}

}
