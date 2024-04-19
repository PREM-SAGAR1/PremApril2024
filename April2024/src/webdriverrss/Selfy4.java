package webdriverrss;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Selfy4 {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver", "D:\\April2023\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		List<WebElement> l = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		
		for(int j=0;j<l.size();j++)
		{
                 Date dt = new Date();
                String d = dt.toString().replace(':', '_').replace(' ', '-');
                 
			String linkname = l.get(j).getText();
			l.get(j).click();
			
			File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
			FileHandler.copy(srcFile,new File("C:\\Users\\Prem\\Desktop\\babas\\jj\\"+linkname+"_"+d+".jpg"));
			l = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
			
		}
	}

}
