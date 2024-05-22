package testcases;

import org.testng.annotations.Test;

import keywords.ApplicationKeywords;

public class Session extends BaseTest
{
	
	
	
  @Test
  public void doLogin() 
  {
	  System.out.println("logging in....");
	  app.click("sigin_linktext");
  
  }
  
  @Test
  public void doLogout() 
  {
	  System.out.println("logging out.....");
  }
}
