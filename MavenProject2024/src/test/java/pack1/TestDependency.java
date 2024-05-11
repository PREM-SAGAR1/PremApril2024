package pack1;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestDependency 
{
	
  @Test(priority=1)
  public void orange()
  {
	  System.out.println("orange");
  }
  
  @Test(priority=2,dependsOnMethods = {"orange"})
  public void white()
  {
	  System.out.println("white");

  }
  @Test(priority=3,dependsOnMethods = {"white"})
  public void Blue()
  {
	  System.out.println("blue= Ashoka chakra");
  //Assert.fail("blue test is failed");
	  
	 throw  new SkipException("blue test is skipped");
  }
  @Test(priority=4,dependsOnMethods = {"Blue"})
  public void green()
  {
	  System.out.println("green");
 
  }
}
