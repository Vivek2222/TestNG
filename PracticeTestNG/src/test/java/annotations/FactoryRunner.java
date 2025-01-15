package annotations;

import org.testng.annotations.Factory;

public class FactoryRunner {
	
	@Factory
	public Object[] factoryRun(){
		return new Object[] { new FactoryDemo("Login"),
				new FactoryDemo("Home"),
				new FactoryDemo("Cart"),
				new FactoryDemo("Checkout")};
	}

}
