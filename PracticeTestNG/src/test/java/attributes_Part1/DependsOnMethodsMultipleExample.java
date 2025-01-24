package attributes_Part1;

import org.testng.annotations.Test;

public class DependsOnMethodsMultipleExample {
	
	@Test (dependsOnMethods = {"parentMethod1", "parentMethod2"})
	public void testMethod1() {
		System.out.println("Test Method");
	}

	@Test
	public void parentMethod1() {
		System.out.println("Parent Test 1 Method");
	}
	
	@Test
	public void parentMethod2() {
		System.out.println("Parent Test 2 Method");
	}

}
