package verifications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Verify2 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "D:\\April2023\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.amazon.in");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("sony");

		
		String text = driver.findElement(By.id("twotabsearchtextbox")).getAttribute("value");
	
		System.out.println("Text :" +text);
	
	}

}
