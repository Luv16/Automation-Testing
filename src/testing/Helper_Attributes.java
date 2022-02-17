package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Helper_Attributes {
	
	WebDriver driver;
 @Test
public void LoginPage()
{
	 System.setProperty("webdriver.chrome.driver", "C:\\Sid_Data\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://login.salesforce.com/?locale=in");
}

@Test(dependsOnMethods= {"LoginPage"}, timeOut=2000)
public void getAttributes()
{
	driver.findElement(By.id("username")).sendKeys("Sidharth");
}
@Test(enabled=false)
public void quit()
{
	driver.close();
}

}
