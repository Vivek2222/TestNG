package attributes_Part2.groupTests;

import org.testng.annotations.Test;


@Test (groups="AllTests2")
public class NewTestGroups2 {
	
	//Ideal ratio
	//smoke - 10 to 20 tests
	//functional - 30 tests
	//regression - 50 to 100 tests
	//Meta groups - groups of groups
	//dailyruns
	//weeklyruns
	
	
	@Test (groups={"smoke", "regression"})
	public void test6() {
		System.out.println("Test6");
	}
	
	@Test (groups="functional")
	public void test7() {
		System.out.println("Test7");
	}
	
	@Test (groups={"smoke", "functional"})
	public void test8() {
		System.out.println("Test8");
	}
	
	@Test (groups={"functional", "regression"})
	public void test9() {
		System.out.println("Test9");
	}

	
	@Test
	public void test10() {
		System.out.println("Test10");
	}


}
