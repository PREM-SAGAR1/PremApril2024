package testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import keywords.ApplicationKeywords;

public class BaseTest
{
   public ApplicationKeywords app;
   
   public String Projectpath = System.getProperty("user.dir");
   
   public  FileInputStream fis;
   
   public Properties orprop;
   
	
   public void init() throws Exception
   {
	  fis = new FileInputStream(Projectpath+"\\src\\test\\resources\\or.properties ");
       orprop = new Properties();
       orprop.load(fis);
   }
   
  @Test
  public void f() 
  {
	  
  }
  
  
  
  @BeforeTest
  public void beforeTest() throws Exception
  {
	  init();
	 app = new ApplicationKeywords();
	 app.openBrowser("firefox");
	 app.navigate("https://portfolio.rediff.com/portfolio");
	 
  }
  
  @BeforeMethod
  public void be()
  {
  }
}
