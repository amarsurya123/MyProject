package kiteAppTestClass_Packege;
import java.io.IOException;
import java.time.Duration;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import kiteAppBaseClass_Packege.BaseClasses;
import kiteAppPOM_Packege.KiteHomePage;
import kiteAppPOM_Packege.KitePinPage;
import kiteAppUtility_Packege.Utility;
import pom.KiteLoginPage;

public class ValidateKiteUserID extends BaseClasses {
 
KiteLoginPage login;
KitePinPage pin;
KiteHomePage home;
@BeforeClass
public void launchBrowser()
{
openBrowser();
login=new KiteLoginPage(driver);
pin= new KitePinPage(driver);
home= new KiteHomePage(driver);
}
@BeforeMethod
public void loginToKiteApp() throws EncryptedDocumentException, 
IOException
{
login.sendUserName(Utility.readDataFormExcel(0, 0));
login.sendPassword(Utility.readDataFormExcel(0,1));
login.clickOnLoginButton();
driver.manage().timeouts().implicitlyWait(Duration.ofMillis(100));
pin.sendPIN(Utility.readDataFormExcel(0, 2));
pin.clickoncontinueButton();
}
@Test
 public void validateUserName() throws EncryptedDocumentException, IOException 
{
String actualUserName = home.getActulUserID();
String expectedUserName=Utility.readDataFormExcel(0, 0);
Assert.assertEquals(actualUserName, expectedUserName,"TC is FAILED actual and expected user names not matching");
Reporter.log("User names are matching TC is passed", true);
Utility.takeScreenshot(driver);
 }
@AfterMethod
public void logoutfromKiteApp() throws InterruptedException
{
home.clickOnLogOutButton();
}
@AfterClass
public void closeBrowser()
{
driver.close();
}
}