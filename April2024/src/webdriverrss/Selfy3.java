package webdriverrss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selfy3 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "D:\\April2023\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		 List<WebElement> links   = driver.findElements(By.tagName("a"));

		 for(int i=0;i<links.size();i++)
		 {
			 System.out.println(links.get(i).getText());
		 }
		 
		 System.out.println("----------");
		 
		List<WebElement> l = driver.findElements(By.xpath("//div[@id='SIvCob']/a[1]"));
	
		for(int j=0;j<l.size();j++)
		{
			System.out.println(l.get(j).getAttribute("innerHTML"));
		}
	
	
	}

}
