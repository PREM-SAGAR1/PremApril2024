package assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class HardAssertDemo
{
	public static void main(String[] args) 
	{
				System.setProperty("webdriver.gecko.driver", "D:\\April2023\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();		
		driver.get("https://www.amazon.in");
		
		driver.manage().window().maximize();
		
	String actualLink=	driver.findElement(By.linkText("Customer Service")).getAttribute("innerHTML");
		
		String expectedLink = "Customer Services";
		
	//Assert.assertEquals(actualLink, expectedLink);
	
			
		Assert.assertTrue(actualLink.equals(expectedLink),"Both links are not equal");
		
	driver.findElement(By.linkText("Customer Service")).click();
	
	}

}
