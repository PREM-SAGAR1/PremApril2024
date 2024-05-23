package testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.testng.ITestContext;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import keywords.ApplicationKeywords;
import reportings.ExtentManager;

public class BaseTest
{
	 public static String Projectpath = System.getProperty("user.dir");

   public ApplicationKeywords app;
   
   public static ExtentReports rep;
   
   public static ExtentTest test;
   
  
	
	/*
	 * public void init() throws Exception { fis = new
	 * FileInputStream(Projectpath+"\\src\\test\\resources\\or.properties "); orprop
	 * = new Properties(); orprop.load(fis); }
	 */   
  @Test
  public void f() 
  {
	  
  }
  
  
  
  @BeforeTest
  public void beforeTest(ITestContext context) throws Exception
  {
	 app = new ApplicationKeywords();
	 context.setAttribute("app",app);
	 app.openBrowser("firefox");
	 app.navigate("https://portfolio.rediff.com/portfolio");
	 
	 
	 //init the Reportings for Test
	 
	rep =  ExtentManager.getReports();
	rep.createTest(context.getCurrentXmlTest().getName());
	
	test.log(Status.INFO,"starting the test :"+context.getCurrentXmlTest().getName());
	
	app.setReport(test);
	context.setAttribute("report",rep);
	context.setAttribute("test",test);
  
  
  }
  
  @BeforeMethod
  public void beforeMetod(ITestContext context)
  {
	app = (ApplicationKeywords)context.getAttribute("app");
	
	rep = (ExtentReports)context.getAttribute("report");
	
	test = (ExtentTest)context.getAttribute("test");

	  
  }
}
