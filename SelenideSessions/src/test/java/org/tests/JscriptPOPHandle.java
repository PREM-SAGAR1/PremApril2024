package org.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.codeborne.selenide.WebDriverRunner;

import static com.codeborne.selenide.Selenide.*;

public class JscriptPOPHandle 
{
	@Test

	public void pop() throws Exception
	{
		open("https://mail.rediff.com/cgi-bin/login.cgi");
	
		$(By.name("proceed")).click();
		
		Thread.sleep(2000);
		
		Alert alert =WebDriverRunner.getWebDriver().switchTo().alert();
		
		
		String text = alert.getText();
		
		System.out.println(text);
		
		Assert.assertEquals(text,"Please enter a valid user name");
		
		alert.accept();
		
		
	
	
	}

}
