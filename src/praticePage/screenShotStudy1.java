package praticePage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenShotStudy1 {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\automotion\\files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
       driver.get("https://www.facebook.com/");
	   Thread.sleep(1000);
	   File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   File Destination=new File("D:\\ScreenShotStudy\\amar.png");
	   FileHandler.copy(source, Destination);
	   
	}

}
