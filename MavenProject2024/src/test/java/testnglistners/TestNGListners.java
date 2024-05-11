package testnglistners;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import pack1.BaseTest;

public class TestNGListners extends BaseTest implements ITestListener 

{

	public void onTestStart(ITestResult result) 
	{
		Reporter.log("Test Started Runnning :"+result.getMethod().getMethodName());
		
	}

	public void onTestSuccess(ITestResult result)
	{
		if(result.isSuccess())
		{
			try {
			File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileHandler.copy(srcFile,new File(projectPath+"//success//"+filepath+".png"));
			
				Reporter.log("<a href='"+projectPath+"//success//"+filepath+".png"+"'> <img src='"+projectPath+"//success//"+filepath+".png"+"'height='100' width='100'/> </a>");
			
				Reporter.log("Test has success :" +result.getMethod().getMethodName());
			} 
			catch (IOException e)
			{
				
				e.printStackTrace();
			}
		}
		
		
	}

	public void onTestFailure(ITestResult result) 
	{
		if(!result.isSuccess())
		{
			try {
			File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileHandler.copy(srcFile,new File(projectPath+"//failure//"+filepath+".png"));
			
				Reporter.log("<a href='"+projectPath+"//failure//"+filepath+".png"+"'> <img src='"+projectPath+"//success//"+filepath+".png"+"'height='100' width='100'/> </a>");
			
				Reporter.log("Test has failed :" +result.getMethod().getMethodName());
			} 
			catch (IOException e)
			{
				
				e.printStackTrace();
			}
		}
		
	}

	public void onTestSkipped(ITestResult result)
	{
		Reporter.log("Test is skipped :"+result.getMethod().getMethodName());

		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
		
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	

	
}