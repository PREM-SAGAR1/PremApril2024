package org.tests;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LaunchBroswerClass 
{
	@Test
	public void LaunchBrowserTest()
	{
		//System.setProperty("webdriver.gecko.driver","//");
          Configuration.browser="firefox";
          Configuration.headless = false;
          

		//System.setProperty("selenide.browser","firefox" );
		
          
          
		open("https://ww.google.com");

		$(By.name("q")).setValue("Naveen Automation labs");
		$(By.name("btnK")).click();
		$(By.id("logo")).shouldHave(Condition.appear);
		String header = $(By.xpath("//h3[text()='Welcome to Naveen AutomationLabs - naveen automationlabs']")).getText();
		
		System.out.println(header);
		Assert.assertEquals(header,"Welcome to Naveen AutomationLabs - naveen automationlabs");
		
		
	
	}

}
