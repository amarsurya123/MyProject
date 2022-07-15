package kiteAppPOM_Packege;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage 
{
	
		//data mamber
	   @FindBy(xpath="//span[@class='user-id']")  private WebElement userID;
	   @FindBy(xpath="//a[@target='_self']") private WebElement logoutButton;
	   
	   //constructor
	   public KiteHomePage(WebDriver Driver)
		{
		   PageFactory.initElements(Driver, this);
		} 
	   
	   //methods
	   public String clickOnUserID()
	   {
		   String actualUserID = userID.getText(); 
		   return actualUserID;
	   }
	   public void clickOnLogOutButton() throws InterruptedException
	   {
		   userID.click();
		   Thread.sleep(100);
		   logoutButton.click();
	   }

	public String getActulUserID1() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getActulUserID() {
		// TODO Auto-generated method stub
		return null;
	}


}
