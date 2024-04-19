package finale;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest 
{
	public static WebDriver driver;
	
	public static String projectPath = System.getProperty("user.dir");

   public static FileInputStream fis;
   
	public static Properties p;
	
	public static Properties mainprop;
	public static Properties childProp;
	public static Properties orProp;
	
	public static ExtentReports  rep;
	
	public static ExtentTest test;
	
	
	
	public static void init() throws Exception
	{
	fis = new FileInputStream(projectPath+"\\data.properties");
	
		p =new Properties();
		p.load(fis);
		
		fis= new FileInputStream(projectPath+"\\environment.properties");
		mainprop = new Properties();
		mainprop.load(fis);
		String e =mainprop.getProperty("env");
		System.out.println(e);
		
		
		fis= new FileInputStream(projectPath+"\\"+e+".properties");
		childProp = new Properties();
		childProp.load(fis);
		System.out.println(childProp.getProperty("amazonurl"));
		
		fis= new FileInputStream(projectPath+"\\or.properties");
	     orProp = new Properties();
	     orProp.load(fis);
	     orProp.getProperty(e);
	     
	     fis= new FileInputStream(projectPath+"\\log4j.config.properties");
	
	     PropertyConfigurator.configure(fis);
	     
	    rep= ExtentManager.getInstance();
	    
	    
	     
	}
	public static void launch(String browser)
	{
		if(p.getProperty(browser).equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(p.getProperty(browser).equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","D:\\April2023\\geckodriver.exe");

			driver=new FirefoxDriver();
		}
	}
	
	public static void navigateUrl(String url)
	{
		driver.get(childProp.getProperty(url));
		
	}

	public static void clickElement(String locatorkey)
	
	{	
	getElement(locatorkey).click();
	
	}

	
		
	
	public static void typeText(String locatorkey, String text)
	{
		
		getElement(locatorkey).sendKeys(text);

	}

	public static void selectOption(String locatorkey, String option)
	{
		
		getElement(locatorkey).sendKeys(option);
}
	
	public static WebElement getElement(String locatorkey)
	{
	
		//check for presence of element
		
		
		
		if(!isElementPresent(locatorkey))
			//report the failure
			
			System.out.println("Element is not present "+locatorkey);
		
		if(!isElementVisible(locatorkey))
		{
			//report failure
			
			System.out.println("ELement is not visible : "+locatorkey);
			
		}
		WebElement element=null;
		
		element = driver.findElement(getLocator(locatorkey));
		
		
		return element;
		
	}
	private static boolean isElementVisible(String locatorkey) 
	{
		
		return false;
	}
	public static boolean isElementPresent(String locatorkey)
	{
		System.out.println("Checking the Element Presence : "+locatorkey);
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		
		try 
		{
			wait.until(ExpectedConditions.presenceOfElementLocated(getLocator(locatorkey)));
			
		
		}
		
		catch (Exception e) 
		   {
			
			return false;
			
			}		
		return true;
	}
	
		public static By getLocator(String locatorkey)
		{
			By by= null;
			
			if(locatorkey.endsWith("_id"))
			{
				by=By.id(orProp.getProperty(locatorkey));
			}
			else if(locatorkey.endsWith("_name"))
			{
				by=By.id(orProp.getProperty(locatorkey));
			}
			else if(locatorkey.endsWith("_classname"))
			{
				by=By.id(orProp.getProperty(locatorkey));
			}
			else if(locatorkey.endsWith("_xpath"))
			{
				by=By.xpath(orProp.getProperty(locatorkey));
			}
			else if(locatorkey.endsWith("_css"))
			{
				by=By.id(orProp.getProperty(locatorkey));
			}
			else if(locatorkey.endsWith("_linktext"))
			{
				by=By.id(orProp.getProperty(locatorkey));
			}
			
			return by;
		}
		
		public static boolean isLinkEqual(String expectedlink) 
		{
			
			String actualLink=driver.findElement(By.linkText("Customer Service")).getText();
			
			if(actualLink.equals(expectedlink))
			
			return true;
			
			else
				return false;
			
		}
		public static void reportSuccess(String PassMessage) 
		{
			
			test.log(Status.PASS,PassMessage);
		}

		public static void reportFailure(String failMessage) throws Exception
		{
			
			test.log(Status.FAIL, failMessage);
			takeScreenshot();
		}
		public static void takeScreenshot() throws Exception 
		{
			Date dt = new Date();
			System.out.println(dt);
			String dateFormat = dt.toString().replace(":","_").replace(" ","_")+".png";
			
			File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			FileHandler.copy(srcFile,new File(projectPath+"//failuress//"+dateFormat));
			
			test.log(Status.INFO,"Screenshot--->"+test.addScreenCaptureFromPath(projectPath+"//failuress//"+dateFormat));
		}
	
}
