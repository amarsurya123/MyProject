
package pom;
import  org.apache.poi.ss.usermodel.Sheet;


import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;


public class TestNGTestClass {
     KiteLoginPage login;
     KitePin PIN;
     KiteHomePage userID;
     WebDriver driver;
    Sheet mySheet;
     
    @BeforeClass
    public void launchBrowser() throws EncryptedDocumentException, IOException 
    {
    	System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        userID=new KiteHomePage(driver);
        login=new KiteLoginPage(driver);
        PIN=new KitePin(driver);
       File Myfile=new File("C:\\Users\\Amar\\Documents\\Book1.xlsx");
        mySheet=WorkbookFactory.create(Myfile).getSheet("Sheet1");
     }
     
	 @BeforeMethod
     public void loginpage() 
     {
		login.sendUserName(mySheet.getRow(0).getCell(0).getStringCellValue());
		Reporter.log("sending username ",true);
		login.sendPassword(mySheet.getRow(0).getCell(1).getStringCellValue());
		Reporter.log("sending password ",true);
		login.clickOnLoginButton();
		Reporter.log("click on login button ",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		PIN.sendPIN(mySheet.getRow(0).getCell(2).getStringCellValue());
		Reporter.log("sending pin",true);
		PIN.clickoncontinueButton();
		Reporter.log("click on button",true);
		
       }
	 @Test
	 public void verifyKiteUserName() throws InterruptedException
	 {   Thread.sleep(1000);
		 String expectedUserID = mySheet.getRow(0).getCell(0).getStringCellValue();
		 String actualUserID = userID.clickOnUserID();
		Assert.assertEquals(expectedUserID,actualUserID,"UserId is not Matching TC is Fail ");
		Reporter.log("UserId is Matching TC is Pass ",true);
	 }
	 @AfterMethod
	 public void logOutFromKiteApp() throws InterruptedException
	 {
		 userID.clickOnLogOutButton();
		 Reporter.log("logging out....",true);
	 }
	 @AfterClass
	 public void closeBrowser()
	 {
		 Reporter.log("close browser...",true);
		 driver.close();
	 }
	 
}
