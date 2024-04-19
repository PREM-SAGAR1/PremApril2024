package org.tests;
import static com.codeborne.selenide.Selenide.*;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Iframes1
{
	@Test
	
	public void IframesTest() throws InterruptedException
	{
		open("https://allwebco-templates.com/support/S_script_IFrame.htm");
	Thread.sleep(5000);
	
	switchTo().frame($(By.xpath("//iframe[@name='Framename' and @class='framesample framesample2']")));
	
	$(By.xpath("//img[@alt='Search']")).click();
	
	$(By.xpath("(//input[@name='terms'])[2]")).sendKeys("testing");
	
	$(By.name("submitbutton")).click();

	Thread.sleep(3000);
	
	switchTo().defaultContent();

	String text= $(By.xpath("//span[text()='Sample website in an IFrame page']")).getText();
	
	System.out.println(text);
	

	
	}
}
