package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
	@FindBy(linkText="Sign in") WebElement signin;

	@FindBy(id="amaa") WebElement useremail;
	
	@FindBy(id="sasa") WebElement userpassword;
	
	@FindBy(id="Submitlogin") WebElement submitlogin;

	@FindBy(xpath="asdasa") WebElement loginerror;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void login()
	{
		signin.click();
		useremail.sendKeys("abba");
		userpassword.sendKeys("password");
		
		submitlogin.click();
	}
	
	public void verifyErrorMessage()
	{
		loginerror.getText();
	}

}
