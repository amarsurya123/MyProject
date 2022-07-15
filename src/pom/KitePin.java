package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePin {
	    @FindBy(id="pin")  private WebElement PIN;
	    @FindBy(xpath="//button[@type='submit']")  private WebElement ContinueButton;
	    
	    //constractor
	    public KitePin(WebDriver driver)
	    {
	    	PageFactory.initElements(driver, this);
	    }
	    //methods
	    public void sendPIN(String KitePin)
	    {
	    	PIN.sendKeys(KitePin);
	    }
	    public void clickoncontinueButton()
	    {
	    	ContinueButton.click();
	    }

}
