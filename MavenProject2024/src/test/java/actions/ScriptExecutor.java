package actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScriptExecutor {

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");

		JavascriptExecutor js = (JavascriptExecutor)driver;
	
		js.executeScript("document.getElementById('email').value='babuaua'");
	
		String title = js.executeScript("return document.title").toString();
		
		System.out.println(title);
		
		//js.executeScript("window.scrollBy(0,400)");
		
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	
		//js.executeScript("document.getElementById('u_0_5_ky').scrollIntoView()");

		
		js.executeScript("window.history.back()");
	
		Thread.sleep(1000);
		js.executeScript("window.history.forward()");

		Thread.sleep(1000);

		js.executeScript("window.history.go(0)");

	}

}
