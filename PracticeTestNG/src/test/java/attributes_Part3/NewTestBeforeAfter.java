package attributes_Part3;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class NewTestBeforeAfter {
	
	@BeforeGroups (groups = "smoke")
	public void beforeGroups() {
		System.out.println("Before Groups");
	}
	
	@AfterGroups (groups = "smoke")
	public void afterGroups() {
		System.out.println("After Groups");
	}
	
	@Test (groups = "smoke")
	public void testMethod1() {
		System.out.println("Test Method One");
	}
	
	@Test (groups = "smoke")
	public void testMethod2() {
		System.out.println("Test Method Two");
	}
	
	@Test
	public void testMethod3() {
		System.out.println("Test Method Three");
	}

}
