package kiteAppPOM_Packege;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage 
{
    //data membar/variables
	@FindBy(id="userid")  private WebElement login;
	@FindBy(id="password")  private WebElement PWS;
	@FindBy(xpath="//button[@type='submit']")  private WebElement LoginButton;
	
	//constructor
	public KiteLoginPage(WebDriver Driver)
	{
	   PageFactory.initElements(Driver, this);
	}
	
	//Methods
	public void sendUserName(String userName)
	{
		login.sendKeys(userName);
	}
	public void sendPassword(String password)
	{
		PWS.sendKeys(password);
	}
	public void clickOnLoginButton()
	{
		LoginButton.click();
	}
	
	
	
}
