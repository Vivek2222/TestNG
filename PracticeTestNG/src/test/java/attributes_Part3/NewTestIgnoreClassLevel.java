package attributes_Part3;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;

//Ignore and disabled works same
@Ignore
public class NewTestIgnoreClassLevel {
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
