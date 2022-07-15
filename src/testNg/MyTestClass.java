package testNg;

import org.checkerframework.common.util.report.qual.ReportCall;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTestClass {
  @Test
  public void mymethod1() 
  {
	  System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");  
		Reporter.log("Method1 is running", true);
   }
  @Test
  public void mymethod2() 
  {
	  System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");  
		Reporter.log("Method2 is running", true);
   }
  @Test
  public void mymethod3() 
  {
	  System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/maps/@18.8154265,76.7751434,7z"); 
		Reporter.log("Method3 is running", true);
   }
} 
