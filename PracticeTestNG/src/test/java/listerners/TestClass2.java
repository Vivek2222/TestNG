package listerners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass2 {
	
	@Test
	public void testMethod1() {
		System.out.println("Test Method One");
	}
	
	@Test(timeOut = 1000)
	public void testMethod2() throws InterruptedException {
		System.out.println("Test Method Two");
		Thread.sleep(2000);
	}
	
	@Test
	public void testMethod3() {
		System.out.println("Test Method Three");
		Assert.assertEquals("TestNGListeners", "TestNGListenersDemo");
	}
	
	@Test (dependsOnMethods = "testMethod3" )
	public void testMethod4() {
		System.out.println("Test Method Four");
	}


}
