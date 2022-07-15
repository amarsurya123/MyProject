package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pinCod
{
    @FindBy(id="pin") private WebElement PIN;
    @FindBy(xpath="//button[@type='submit']") private WebElement ContinueButton;
    
    public pinCod(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    
    public void sendPIN()
    {
    	PIN.sendKeys("982278");
    }
    public void clickoncontinueButton()
    {
    	ContinueButton.click();
    }
}
