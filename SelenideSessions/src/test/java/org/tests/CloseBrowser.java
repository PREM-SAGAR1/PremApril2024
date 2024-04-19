package org.tests;

import static com.codeborne.selenide.Selenide.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class CloseBrowser
{
	WebDriver driver;
	
	 @Test
	 public void closeBrowserTest() throws Exception
	 {
		 open("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
		 System.out.println(title());
		 
		 Thread.sleep(3000);
		 
		 $(By.xpath("//div[@class='orangehrm-login-footer-sm']/a[4]")).click();
		 
		 switchTo().window(1);
		 
		 Thread.sleep(3000);

		 System.out.println(title());
		 
		 closeWindow();
		 
		 
		 switchTo().window(0);
		 
		 System.out.println(title());
		 
		 Thread.sleep(2000);
		 
		 closeWebDriver();
	 
	 
	 
	 
	 
	 }
	 

}
