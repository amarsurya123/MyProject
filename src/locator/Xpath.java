package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException
	{
      System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\automotion\\files\\chromedriver_win32\\chromedriver.exe");
	  
      WebDriver driver=new ChromeDriver();
      driver.get("https://www.facebook.com/");
	  driver.manage().window().maximize();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//button[@name='login']")).click();
	  
	  
	}

}