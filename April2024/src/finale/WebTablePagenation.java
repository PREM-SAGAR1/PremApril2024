package finale;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTablePagenation {

	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.firefoxdriver().setup();
		
         WebDriver driver= new FirefoxDriver();
         
         driver.get("https://datatables.net/examples/advanced_init/dt_events.html");
         
         driver.manage().window().maximize();
         
       int pageMaxSize=   driver.findElements(By.cssSelector("div[class='dt-paging paging_full_numbers']>button)")).size();
	
	System.out.println("total number of pages : "+ pageMaxSize);
	
	for(int i=1;i<=pageMaxSize;i++)
	{
		
		String pageSelector = "div[class='dt-paging paging_full_numbers']>button:nth-child("+i+")";
		
		driver.findElement(By.cssSelector(pageSelector)).click();
		List<WebElement> ElementNames = driver.findElements(By.cssSelector("table[id='example']>tbody>tr>td:nth-child(1)"));
	
		for(WebElement ElementName:ElementNames)
		{
			System.out.println(ElementName.getText());
		}
		Thread.sleep(2000);
	
	
	}
	
	//"div[class=\"dt-paging paging_full_numbers\"]>button[class='dt-paging-button current']"
	}

}
