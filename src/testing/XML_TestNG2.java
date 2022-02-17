package testing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class XML_TestNG2 {

	@BeforeClass
	  public void add_testing_1() {
		  System.out.println("WINNNNNNNNNNNNNNNNNNNNNNNNN");
		
	  }
	@AfterMethod
	  public void tata_() {
		  System.out.println("Done!!!!!!!!!!!!!");
		
	  }
	@Test(groups= {"Smoke"})
	  public void tata() {
		  System.out.println("TATA BYE BYE!");
		
	  }
	   @Test
	  public void bye() {
		   System.out.println("GOOD NIGHT!");
	  }
	   @AfterClass
		  public void add_testing_2() {
			  System.out.println("LOOOOOOOOOOOOOOOOSEEEEE");
			
		  }
}
