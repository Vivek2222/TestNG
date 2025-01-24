package attributes_Part1;

import org.testng.annotations.Test;

public class DependsOnMethodsExample {
	

	@Test
	public void parentMethod() {
		System.out.println("Parent Test Method");
	}
	
	//for error
	@Test (dependsOnMethods = "parentMethod123")
	public void testMethod() {
		System.out.println("Test Method");
	}
	
	
	@Test (dependsOnMethods = "parentMethod")
	public void testMethod1() {
		System.out.println("Test Method");
	}

}
