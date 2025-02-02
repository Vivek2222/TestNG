package attributes_Part3;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class NewTestAlwayasRun {
	
	@BeforeGroups (groups = "GroupDependency")
	public void beforeGroups() {
		System.out.println("Before Groups");
	}
	
	
	@AfterGroups (groups = "GroupDependency")
	public void afterGroups() {
		System.out.println("After Groups");
	}
	
	
	@Test (groups = "GroupDependency")
	public void testMethod1() {
		System.out.println("Test Method One");
	}
	
	
	@Test (groups = "GroupDependency", timeOut = 1000)
	public void testmethod2() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Test Methdo Two");
	}
	
	
	@Test (dependsOnGroups = "GroupDependency", alwaysRun = true)
	public void test() {
		System.out.println("Test Message");
	}

}
