package assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.asserts.SoftAssert;

public class Softassert 
{
	

	
	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.gecko.driver", "D:\\April2023\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.amazon.in");

		driver.manage().window().maximize();		
		
		driver.manage().window().maximize();
		
	String actualLink=	driver.findElement(By.linkText("Customer Service")).getAttribute("innerHTML");
		
		String expectedLink = "Customer Service";
		
		SoftAssert s = new SoftAssert();
		//s.assertEquals(actualLink, expectedLink);
	
		//s.assertTrue(actualLink.equals(expectedLink),"Both link are not equal");
		
		s.assertTrue(false,"err1");
		
		s.assertTrue(false,"err2");

		s.assertTrue(true,"err3");

		s.assertTrue(false,"err4");

		
		
		driver.findElement(By.linkText("Customer Service")).click();

		s.assertAll();
	}

}
