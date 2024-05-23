package testcases;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class PortfolioManagement extends BaseTest
{
	
  @Test
  public void createPortfolio() 
  {
	  test.log(Status.INFO,"createPortfolio");
   }
  
  @Test
  public void DeletePortfolio() 
  {
System.out.println("DeletePortfolio");
  }
  
  @Test
  public void ModifyPortfolio() 
  {
	System.out.println("ModifyPortfolio");  
  }
  
}
