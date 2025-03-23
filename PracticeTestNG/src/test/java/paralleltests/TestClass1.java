package paralleltests;

import org.testng.annotations.Test;

public class TestClass1 {
	
	//Parallel - Thread: 5, 2to3 hrs
	
	//Sequential - Default Behavior - One by one
	//1000 Tests - 10 hrs
	
	@Test
	public void testMethod1() {
		
		System.out.println(" TestClass1 > TestMethod 1 : " +Thread.currentThread().threadId());
	}
	
	@Test
	public void testMethod2() {
		
		System.out.println(" TestClass1 > TestMethod 2 : "+Thread.currentThread().threadId());
	}
	
	@Test
	public void testMethod3() {
		
		System.out.println(" TestClass1 > TestMethod 3 : "+Thread.currentThread().threadId());
	}

}
