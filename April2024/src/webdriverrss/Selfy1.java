package webdriverrss;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Selfy1 {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.gecko.driver","D:\\April2023\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.amazon.in");
		
		driver.manage().window().maximize();
		
		
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
		FileHandler.copy(srcFile,new File("C:\\Users\\Prem\\Desktop\\july\\ko\\amazon.png"));
	
	
	}

}
