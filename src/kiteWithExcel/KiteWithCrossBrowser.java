package kiteWithExcel;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class KiteWithCrossBrowser {

WebDriver driver;
Sheet mySheet;
@Parameters("browser")
@BeforeClass
public void launchBrowser(String browser) throws EncryptedDocumentException, 
IOException
{
if(browser.equals("chrome")) 
{
	System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Selenium\\chromedriver_win32\\chromedriver.exe");
    driver= new ChromeDriver();
}
else if (browser.equals("firefox")) 
{
	System.setProperty("webdriver.gecko.driver","D:\\Software Testing\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe");

     driver= new FirefoxDriver();
}


}

}
