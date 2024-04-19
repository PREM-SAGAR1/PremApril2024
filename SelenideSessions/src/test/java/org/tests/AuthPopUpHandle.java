package org.tests;
import static com.codeborne.selenide.Selenide.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.codeborne.selenide.Configuration;

public class AuthPopUpHandle 
{
	@Test
	public void authpop() throws Exception
	{
		//open("https://the-internet.herokuapp.com/basic_auth");
	
		Configuration.browser="firefox";
		open("https://the-internet.herokuapp.com/basic_auth","","admin","admin");
		
		Thread.sleep(5000);
		
		String text =$(By.cssSelector("div.example")).getText();
	
	Assert.assertTrue(text.contains("Congratulations"));
	
	}
	

}
