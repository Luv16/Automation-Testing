package testing;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class XML_TestNG1 {

	@Test
	  public void decide() {
		  System.out.println("Do your work!");
		
	  }
	   @Parameters({"URL"})
	   @BeforeTest
	  public void behave(String url) {
		   System.out.println(url);
	  }
	   
	   @Test(groups= {"Smoke"})
		  public void behave_Test() {
			   System.out.println("Have a good day!");
		  }
}
