package testcases;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import keywords.ApplicationKeywords;

public class Session extends BaseTest
{
	
	
	
  @Test
  public void doLogin() 
  {
	  test.log(Status.INFO,"Logging In....");
	 
	  app.openBrowser("firefox");
	  app.navigate("rediffurl");
	  
	  app.click("sigin_linktext");
	  app.type("useremail_id","rediffuser");
	  app.type("userpassword_name","rediffpassword");
  
	  app.click("submit_id");
  }
  
  @Test
  public void doLogout() 
  {
	  test.log(Status.INFO,"logging out ....");

  }
}
