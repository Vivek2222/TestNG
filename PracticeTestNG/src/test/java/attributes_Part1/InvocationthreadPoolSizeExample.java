package attributes_Part1;

import org.testng.annotations.Test;


//Use this for opening multiple browser or create a data at the same time parallely/ Threadpoolsize is the opening count of browser at the same time.
public class InvocationthreadPoolSizeExample {

	@Test (invocationCount =100, threadPoolSize = 10)
	public void testData(){
		System.out.println("Test Message");
	}
}
