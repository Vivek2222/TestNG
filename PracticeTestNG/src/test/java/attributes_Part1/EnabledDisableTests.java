package attributes_Part1;

import org.testng.annotations.Test;

public class EnabledDisableTests {
	
	
	@Test (enabled=false)
	public void testCase1() {
		System.out.println("TestCase One");
	}
	
	@Test (enabled=true)
	public void testCase2() {
		System.out.println("TestCase Two");
	}
	
	@Test (enabled=false)
	public void testCase3() {
		System.out.println("TestCase three");
	}
	
	@Test (enabled=false)
	public void testCase4() {
		System.out.println("TestCase four");
	}

}
