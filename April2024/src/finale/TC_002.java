package finale;

public class TC_002 extends BaseTest

{
	

	public static void main(String[] args) throws Exception 
	{
		
		init();
		
		launch("firefoxbrowser");
		
     navigateUrl("amazonurl");
     
     driver.manage().window().maximize();
     
     
     String title = driver.getTitle();
     System.out.println(title);
     
     String url = driver.getCurrentUrl();
     System.out.println(url);
     
     driver.manage().deleteAllCookies();
     
     driver.navigate().back();
     
     Thread.sleep(5000);
     
     driver.navigate().forward();
     
     Thread.sleep(5000);
     
     driver.navigate().refresh();
     
     
     driver.close();
     
     
     driver.quit();
     
     
     
     
	}

}
