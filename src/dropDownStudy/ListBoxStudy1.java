package dropDownStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxStudy1 
{
public static void main(String[] args) throws InterruptedException 
{
	
	System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(1000);
	driver.manage().window().maximize();
	driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	Thread.sleep(1000);
	WebElement day=driver.findElement(By.id("day"));
	Select s1=new Select(day);
	Thread.sleep(100);
	s1.selectByIndex(0);
	
	WebElement month=driver.findElement(By.id("month"));
	Select s2=new Select(month);
	Thread.sleep(100);
	s2.selectByVisibleText("nov");
	
	WebElement year=driver.findElement(By.id("year"));
	Select s3=new Select(year);
    Thread.sleep(100);
    s3.selectByValue("1996");
	
	
	
	
	
}
}
