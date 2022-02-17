package testing;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Basics_TestNG {

      
		  @BeforeMethod
		  public void add_testing() {
			  System.out.println("Please see below:");
			
		  }
		  @Test(groups= {"Smoke"})
		  public void add_Test() {
			  System.out.println("Hello Sidharth!");
			
		  }
		  @Parameters({"URL", "ID"})
		  @Test
		  public void subtract(String url, String id) {
			   System.out.println(url+":"+id);
		  }
		   @AfterTest
	      public void multiply() {
			   System.out.println("Hello Bishop!");
			  }
		   @Test
	     public void division() {
			   System.out.println("Hello Nikhil!");
			  }
		   @Test
			  public void add_learn() {
				  System.out.println("Hello Sid!");
				
			  }
}
