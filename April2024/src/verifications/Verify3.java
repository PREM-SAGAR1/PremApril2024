package verifications;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.Status;

import finale.BaseTest;

public class Verify3 extends BaseTest


{

	public static void main(String[] args) throws Exception
	{
		init();
		test = rep.createTest("Verify3");
		test.log(Status.INFO, "Init the properties files..." );

		launch("firefoxbrowser");
		  test.log(Status.PASS, "Launching the browser...- "+ p.getProperty("firefoxbrowser"));

		
		navigateUrl("amazonurl");
	     test.log(Status.PASS,"Navigated to Url : "+childProp.getProperty("amazonurl"));

		
		driver.manage().window().maximize();

        String Expectedlink = "Customer Service";
		
        if(!isLinkEqual(Expectedlink))
		
			//System.out.println("Both links are not equal");
		reportFailure("Both links are not equal");
		
		else
		
			//System.out.println("Both links are equal");
		reportSuccess("Both links are equal");
        
        
        rep.flush();
		
	}

	

	

}
