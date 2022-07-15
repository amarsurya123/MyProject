package praticePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listBoxStudy1 {

	public static <Webdriver> void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\automotion\\files\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
			Thread.sleep(1000);
//			driver.findElement(By.name("firstname")).sendKeys("amar");
//			Thread.sleep(1000);
			WebElement value = driver.findElement(By.name("birthday_day"));
			Select s1=new Select(value);
			s1.selectByValue("26");
			Thread.sleep(1000);
			WebElement month = driver.findElement(By.id("month"));
			Select s2=new Select(month);
			s2.selectByVisibleText("Nov");
			Thread.sleep(1000);
			WebElement year = driver.findElement(By.id("year"));
			Select s3=new Select(year);
			s3.selectByIndex(1996);
			
			
	}

}
