package org.tests;

import static com.codeborne.selenide.Selenide.*;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

public class FindElementConcept
{
	@Test
	public void elementsTest()
	{
		open("https://www.amazon.in");
		ElementsCollection cols = $$(By.tagName("a"));
	    System.out.println(cols.size());
	
//	    for(SelenideElement e : cols)
//	    {
//	    	String text = e.getText();
//	    	String href = e.getAttribute("href");
//	    	System.out.println(text + "---"+href);
//	    }
	    cols.shouldHave(CollectionCondition.sizeLessThan(400));
	
	//cols.forEach(e -> System.out.println(e.getText()));
	
	
	}
	

}
