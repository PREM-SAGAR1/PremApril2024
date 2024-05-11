package suitesParallel;

import org.testng.annotations.Test;

public class NewTest 
{
	
  @Test
  public void test1() 
  {
	  System.out.println("i am test1  :"+Thread.currentThread().getId());
  }
  
  @Test
  public void test2() 
  {
	  System.out.println("i am test2 :"+Thread.currentThread().getId());
  }
  @Test
  public void test3() 
  {
	  System.out.println("i am test3: "+Thread.currentThread().getId());
  }
}
