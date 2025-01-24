package attributes_Part1;

import org.testng.annotations.Test;

//It can be useful when you tried to create a data for test and use it in next step

public class DependsOnMethodsMultipleExample2 {
	
	@Test (dependsOnMethods = {"parentMethod1", "parentMethod2"})
	public void testMethod1() {
		System.out.println("Test Method");
	}

	@Test
	public void parentMethod1() {
		System.out.println("Parent Test 1 Method");
	}
	
	@Test (timeOut=1000)
	public void parentMethod2() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Parent Test 2 Method");
	}

}
