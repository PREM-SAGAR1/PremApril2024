package finale;

import org.apache.log4j.Logger;

import com.aventstack.extentreports.Status;

public class TC_004 extends BaseTest
{

	private static Logger log = Logger.getLogger("TC_004");
	
	public static void main(String[] args) throws Exception
	{
		init();
		
		test = rep.createTest("TC_004");
		
		test.log(Status.INFO, "Init the properties files..." );
	      
			
		  launch("firefoxbrowser");
		  
		  test.log(Status.PASS, "Launching the browser...- "+ p.getProperty("firefoxbrowser"));
			
	     navigateUrl("amazonurl");
	     
	     test.log(Status.PASS,"Navigated to Url : "+childProp.getProperty("amazonurl"));
	     
	     
	     
	     
	   selectOption("amazondropdown_id","Books");
	   
	   test.log(Status.PASS,"Select the option Books By using the locator :- "+orProp.getProperty("amazondropdown_id"));
	   
	   
	     
	     typeText("amazontextbox_id","Harry Potter");
	  test.log(Status.PASS,"Entere the text Harry Potter By using locator :-"+orProp.getProperty("amazontextbox_name"));
	     
	  
	     clickElement("amazonsearchbutton_xpath");
   
	    test.log(Status.PASS,"Clicked the element by using the locator :-"+orProp.getProperty("amazonsearchbutton_xpath"));

	rep.flush();
	
	
	    
	
	}

}
