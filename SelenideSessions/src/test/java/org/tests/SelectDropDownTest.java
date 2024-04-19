package org.tests;

import static com.codeborne.selenide.Selenide.*;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

public class SelectDropDownTest 
{
	@Test
	public void userActions() throws Exception
	{
		open("https://www.orangehrm.com/en/30-day-free-trial/");
	
	$(By.id("Form_getForm_Country")).selectOption(2);
	
	Thread.sleep(2000);

	$(By.id("Form_getForm_Country")).selectOption("India");

	Thread.sleep(2000);

	$(By.id("Form_getForm_Country")).selectOptionByValue("France"); 

	Thread.sleep(2000);
	
	//without using select tag
	
	
	ElementsCollection col = $$(By.cssSelector("select#Form_getForm_Country"));
	
	System.out.println(col.size());
	
	for(SelenideElement e :col)
	{
		String text = e.getText();

		System.out.println(text);
		if(text.equals("Angola"))
		{
			e.click();
			break;
		}
	}
	
	
	}
	
	
	

}
