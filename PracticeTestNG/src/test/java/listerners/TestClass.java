package listerners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//For multiple listener we can pass a array- in @Listeners({TestListenersClass.class, TestListenersClass.class})
@Listeners(TestListenersClass.class)
public class TestClass {
	
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
