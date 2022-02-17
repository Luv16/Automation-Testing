package testing;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class XML_TestNG3 {
	@BeforeSuite(groups= {"Smoke"})
	  public void tata() {
		  System.out.println("I am first to execute!");
		
	  }
	   @AfterSuite
	  public void bye() {
		   System.out.println("I am last to execute!");
	  }
	   @Test(groups= {"Smoke"})
		  public void bye_Sir() {
			   System.out.println("I am Smoke test!");
		  }
}
