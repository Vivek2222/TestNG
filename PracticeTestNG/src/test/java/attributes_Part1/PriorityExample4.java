package attributes_Part1;

import org.testng.annotations.Test;

public class PriorityExample4 {
	
	//Integer
	//-2^31 to 2^31-1
	//int minValue = Integer.MIN_VALUE; // -2147483648
	//int maxValue = Integer.MAX_VALUE; // 2147483647
	
	@Test (priority=-2147483648)
	public void loginPage() {
		System.out.println("Login Page");
	}
	
	@Test (priority=2147483641)
	public void productPage() {
		System.out.println("Product Page");
	}
	
	@Test (priority=214748364)
	public void cartPage() {
		System.out.println("Cart Page");
	}
	
	@Test (priority=-2)
	public void checkoutPage() {
		System.out.println("Checkout Page");
	}
	
	@Test (priority=2147483647)
	public void paymentPage() {
		System.out.println("Payment Page");
	}

}
