package org.tests;

import static com.codeborne.selenide.Selenide.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Iframes 
{
	@Test
	public void frameTest() throws Exception
	{
		open("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
        Thread.sleep(2000);
        
       // switchTo().frame("globalSqa");
       $(By.xpath("(//div[@class='pic_holder'])[2]")).click();
       
       Thread.sleep(5000);
	}

}
