package attributes_Part1;

import org.testng.annotations.Test;

public class InvocationCountExample {

	@Test (invocationCount = 5, invocationTimeOut = 10000)
	public void testData() throws InterruptedException{
		Thread.sleep(3000);
		System.out.println("Test Message");
	}
}
