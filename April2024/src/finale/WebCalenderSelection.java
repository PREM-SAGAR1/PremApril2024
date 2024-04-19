package finale;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebCalenderSelection {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.gecko.driver","D:\\April2023\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://goibibo.com");
		
		driver.manage().window().maximize();
		
		driver.navigate().refresh();
		
		driver.findElement(By.xpath("(//span[@class='sc-12foipm-17 eBxhjL fswWidgetLabel'])[3]")).click();
		
		driver.findElement(By.xpath("//div[@class='gr_fswFld active']")).click();
		
		
		while(!driver.findElement(By.xpath("//div[@class='DayPicker-Caption'])[2]")).getText().contains("August 2024"))
		{
			driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
		}
		
		List<WebElement> dateList = driver.findElements(By.xpath("(//div[@class='DayPicker-Body'])[2]/div/div"));
	
		for(int i=0;i<dateList.size();i++)
		{
			String dateText = dateList.get(i).getText();
			System.out.println(dateText);
			if(dateList.get(i).getText().equals("14"))
			{
				dateList.get(i).click();
				break;
			}
		}
	
	}

}
