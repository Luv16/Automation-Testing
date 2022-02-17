package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Annotations {

	WebDriver driver;
	
 @DataProvider
public  Object[][] LoginPage()
{
	 System.setProperty("webdriver.chrome.driver", "C:\\Sid_Data\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://login.salesforce.com/?locale=in");
	String username=driver.findElement(By.cssSelector("[for='username']")).getText();
	String password=driver.findElement(By.cssSelector("[for='password']")).getText();
	Object[][] data=new Object[1][2];
	data[0][0]= username;
	data[0][1]= password;
	return data;
	
}

@Test(dataProvider="LoginPage")
public void getAttributes(String username, String password)
{
	System.out.println(username+"   "+password);
}
@Test
public void quit()
{
	driver.close();
}


}
