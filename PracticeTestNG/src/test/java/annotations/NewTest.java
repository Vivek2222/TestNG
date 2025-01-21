package annotations;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;

//Before and After Method
public class NewTest {
  @Test
  public void testMethod_1() {
	  System.out.println("This is Test Method 1");
  }
  @Test
  public void testMethod_2() {
	  System.out.println("This is Test Method 2");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This is Before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This is After Method");

  }

}
