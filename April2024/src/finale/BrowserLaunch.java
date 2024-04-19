package finale;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch {

	public static void main(String[] args)
	{
		//System.setProperty("webdriver.gecko.driver","D:\\April2023\\geckodriver.exe");
		//WebDriverManager.firefoxdriver().setup();
		//FirefoxDriver driver=new FirefoxDriver();
		
		//driver.get("https://www.facebook.com");
		
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\drivers 2024\\chrome-win64\\chrome-win64\\chrome.exe");
		//WebDriverManager.chromedriver().setup();
		
		ChromeDriver driverr = new ChromeDriver();
		
		driverr.get("https://www.facebook.com");

	}

}
