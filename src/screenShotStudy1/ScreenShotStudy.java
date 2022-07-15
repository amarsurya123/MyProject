 package screenShotStudy1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenShotStudy {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
       driver.get("https://www.facebook.com/");
	   Thread.sleep(1000);
	   
	   File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   String random = RandomString.make(3);
	   File Destination=new File("D:\\ScreenShotStudy\\myscreeShot "+random+".png");
	   FileHandler.copy(Source, Destination);
	
	}

}
