package pack1;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;

public class TNG_001 extends BaseTest
{
  
  @BeforeMethod(groups= {"regression","sanity"})
  @Parameters("browser")
  public void startprocess(String bType) throws Exception
  {
	  System.out.println("Before method");
	  init();
		
		test = rep.createTest("TNG_001");
		
		test.log(Status.INFO, "Init the properties files..." );
	      
			
		  launch("bType");
		  
		  test.log(Status.PASS, "Launching the browser...- "+ p.getProperty("firefoxbrowser"));
			
	     navigateUrl("amazonurl");
	     
	     test.log(Status.PASS,"Navigated to Url : "+childProp.getProperty("amazonurl"));
	     
	     
  }
  @Test(groups= {"regression","sanity"})
  public void amazon()
  {
	  
	  System.out.println("Amazon test method");
	   
	   selectOption("amazondropdown_id","Books");
	   
	   test.log(Status.PASS,"Select the option Books By using the locator :- "+orProp.getProperty("amazondropdown_id"));
	   
	   
	     
	     typeText("amazontextbox_id","Harry Potter");
	  test.log(Status.PASS,"Entere the text Harry Potter By using locator :-"+orProp.getProperty("amazontextbox_name"));
	     
	  
	     clickElement("amazonsearchbutton_xpath");
  
	    test.log(Status.PASS,"Clicked the element by using the locator :-"+orProp.getProperty("amazonsearchbutton_xpath"));

	  
  }

  @AfterMethod(groups= {"regression","sanity"})
  public void endProcess() 
  {
	  rep.flush();
	  driver.quit();
  }

}
