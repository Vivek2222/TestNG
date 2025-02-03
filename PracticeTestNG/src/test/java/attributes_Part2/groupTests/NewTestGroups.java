package attributes_Part2.groupTests;

import org.testng.annotations.Test;

public class NewTestGroups {
	
	//Ideal ratio
	//smoke - 10 to 20 tests
	//functional - 30 tests
	//regression - 50 to 100 tests
	//Meta groups - groups of groups
	//dailyruns
	//weeklyruns
	
	
	@Test (groups={"smoke", "regression"})
	public void test1() {
		System.out.println("Test1");
	}
	
	@Test (groups="functional")
	public void test2() {
		System.out.println("Test2");
	}
	
	@Test (groups={"smoke", "functional"})
	public void test3() {
		System.out.println("Test3");
	}
	
	@Test (groups={"functional", "regression"})
	public void test4() {
		System.out.println("Test4");
	}

	
	@Test (groups="regression")
	public void test5() {
		System.out.println("Test5");
	}


}
