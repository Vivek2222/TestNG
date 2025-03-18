package attributes_Part1;

import org.testng.annotations.Test;

public class TimeoutExample {
	
	@Test (timeOut = 10000)
	public void testMethodTimeout() throws InterruptedException {
		
		Thread.sleep(12000);
		System.out.println("Test Message");
	}

}
