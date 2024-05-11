package switches;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchWindow1 {

	public static void main(String[] args)
	
	{
		
 WebDriverManager.firefoxdriver().setup();

 FirefoxOptions options = new FirefoxOptions();
 options.addArguments("--disable-notifications");
 
  WebDriver driver = new FirefoxDriver();

  driver.manage().window().maximize();
  driver.get("https://www.icicibank.com");
  
  
  
 String parentwindow = driver.getWindowHandle();
 System.out.println(parentwindow);
 System.out.println(driver.getTitle());
	}

}
