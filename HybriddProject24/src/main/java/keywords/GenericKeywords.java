package keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GenericKeywords  extends ValidationKeywords 

{
	
	public WebDriver driver;
	
	public void openBrowser(String browser)
	{
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
		driver.navigate().to(url);
	}
	
	public void click(String locatorkey)
	{
		getElement(locatorkey).click();
		
	}
	
	public void type(String locatorkey,String text)
	{
		
	}
	
	public void selectOption(String locatorkey,String option)
	{
		
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


	

}
