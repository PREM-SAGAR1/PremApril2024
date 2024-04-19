package webdriverrss;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Selfy2 {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.gecko.driver", "D:\\April2023\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		List<WebElement> links = driver.findElements(By.linkText("Rajinikanth"));
	
		
		if(links.size()==0)
		{
			File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileHandler.copy(srcFile,new File("C:\\Users\\Prem\\Desktop\\july\\ko\\google.jpg"));
		
		
		}
	
	
	}

}
