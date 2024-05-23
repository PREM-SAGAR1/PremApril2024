package keywords;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GenericKeywords  extends ValidationKeywords 

{
	
	public WebDriver driver;
	 public String Projectpath = System.getProperty("user.dir");
	   
	   public  FileInputStream fis;
	   
	   public Properties orprop;
	   
	   public Properties mainprop;
	   
	   public Properties childprop;
	   
	   public ExtentTest test;
	   
	
	public void openBrowser(String browser)
	{
		
		log("Openinig Browser : "+browser);
		if(browser.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
		}
		else if(browser.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
	}
	
	public void navigate(String url)
	{
		log("Navigate to url : "+url);
		driver.navigate().to(url);
	}
	
	public void click(String locatorkey)
	{
		log("Clicking on element"+locatorkey);

		getElement(locatorkey).click();
		
	}
	
	public void type(String locatorkey,String text)
	{
		log("typing some text "+locatorkey);

		getElement(locatorkey).sendKeys(text);

	}
	
	public void selectOption(String locatorkey,String option)
	{
		log("selectOption "+locatorkey);

		getElement(locatorkey).sendKeys(option);

	}
	
	public String getText(String locatorkey)
	{
		return null;
	}
	
	
	public WebElement getElement(String locatorkey)
	{
		WebElement element = null;
		
		//check for presence of element
		if(!isElementPresent(locatorkey))
			
			//report the failure
			System.out.println("Element is not present : -"+locatorkey);
		
		element = driver.findElement(getLocator(locatorkey));
		return element;
		
	}

	public boolean isElementPresent(String locatorkey) 
	{
		System.out.println("checking for the Element Presence :"+locatorkey);
		WebDriverWait wait = new WebDriverWait(driver,15);
		
		
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id(locatorkey)));
			
		} 
		
		catch (Exception e) 
		{
			return false;

		}
		return true;
	}
	
	public By getLocator(String locatorkey)
	{
		
		By by = null;
		
		if(locatorkey.endsWith("_id"))
		{
			by = By.id(locatorkey);
			
		}
		else if(locatorkey.endsWith("_name"))
		{
			by = By.name(locatorkey);
			
		}
		
		else if(locatorkey.endsWith("_classname"))
		{
			by = By.className(locatorkey);
			
		}
		else if(locatorkey.endsWith("_xpath"))
		{
			by = By.xpath(locatorkey);
			
		}
		else if(locatorkey.endsWith("_linktext"))
		{
			by = By.linkText(locatorkey);
			
		}
		else if(locatorkey.endsWith("_partial"))
		{
			by = By.partialLinkText(locatorkey);
			
		}
		else if(locatorkey.endsWith("_css"))
		{
			by = By.cssSelector(locatorkey);
			
		}
		
		return null;
		
	}

	
	public void setReport(ExtentTest test)
	{
		this.test = test;
		
	}
	
	//Reporting Function
	
	public void log(String msg)
	{
		test.log(Status.INFO,msg);
	}

	

}
