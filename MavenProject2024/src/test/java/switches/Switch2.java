package switches;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Switch2 {

	public static void main(String[] args) 
	{
		WebDriverManager.firefoxdriver().setup();

		 FirefoxOptions options = new FirefoxOptions();
		 options.addArguments("--incognito");
		 
		  WebDriver driver = new FirefoxDriver();

		  driver.manage().window().maximize();
		  
		  driver.get("https://www.google.com");
		  
		  System.out.println(driver.getTitle());

		  
		  driver.switchTo().newWindow(WindowType.WINDOW);
		  
		  driver.get("https://www.amazon.in");
		  System.out.println(driver.getTitle());
	}

}
