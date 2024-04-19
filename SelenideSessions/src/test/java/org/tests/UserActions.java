package org.tests;
import static com.codeborne.selenide.Selenide.*;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.codeborne.selenide.SelenideElement;

public class UserActions 
{
	@Test(enabled=false)
	public void user() throws Exception
	{
		open("https://www.spicejet.com/");
	
	    SelenideElement addon = $(By.xpath("//div[text()='Add-ons']"));
	     
	   actions().moveToElement(addon).build().perform();
	   
	    SelenideElement visa = $(By.xpath("(//div[text()='Visa Services'])[1]"));

	    visa.click();
	   Thread.sleep(2000);
	
	}
	
	@Test
	public void DrAGANDdROP() throws Exception
	{
	
open("https://jqueryui.com/droppable/");
//	  
	  SelenideElement sourceEle = $(By.xpath("//div[@id='draggable']"));
//	
//	  
  SelenideElement locatorEle = $(By.xpath("//div[@id='droppable']"));
//	  
//	  
//	 actions().clickAndHold(sourceEle).moveToElement(locatorEle).release().build().perform();
//	  
		
		actions().dragAndDrop(sourceEle,locatorEle).build().perform();
		
		Thread.sleep(2000);
	}
	
	
	@Test
	public void rightclick() throws Exception
	{
		open("https://www.spicejet.com/");
	
	    SelenideElement addon = $(By.xpath("//div[text()='Add-ons']"));
	     
	   actions().moveToElement(addon).build().perform();
	   
	    SelenideElement visa = $(By.xpath("(//div[text()='Visa Services'])[1]"));

	    visa.click();
	   Thread.sleep(2000);
	
	}

}
