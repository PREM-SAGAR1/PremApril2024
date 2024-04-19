package org.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.codeborne.selenide.WebDriverRunner;

import static com.codeborne.selenide.Selenide.*;

import java.util.concurrent.TimeUnit;

public class WebdriverRunnerTest 
{
	
	@Test
	public void myTest()
	{
	open("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	WebDriverRunner.clearBrowserCache();
	System.out.println(WebDriverRunner.url());
	
	Assert.assertTrue(WebDriverRunner.url().contains("orangehrmlive"));
	System.out.println(WebDriverRunner.source());
	
	if(WebDriverRunner.isChrome())
		
	{
		System.out.println("click on button");
	}
	
	
	
	
	
	WebDriverRunner.closeWebDriver();
	
	
	
	}

}
