package keywords;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ApplicationKeywords extends GenericKeywords


{
	
	public ApplicationKeywords() throws Exception
	{
		
		mainprop = new Properties();
		childprop = new Properties();
		orprop = new Properties();
		
		try 
		{
			fis = new FileInputStream(Projectpath+"\\src\\test\\resources\\environment.properties");
           mainprop.load(fis);
           String e = mainprop.getProperty("env");
           
           fis = new  FileInputStream(Projectpath+"\\src\\test\\resources\\"+e+".properties");
		childprop.load(fis);

        fis = new  FileInputStream(Projectpath+"\\src\\test\\resources\\or.properties");
        orprop.load(fis);
        

			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			
		}
	
	}

	public void customerLogin()
	{
		
	}
	
	public void selectDatefromCalender()
	{
		
	}
}
