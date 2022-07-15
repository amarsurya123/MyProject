package dropDownStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxStudy {

	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Selenium\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		 driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(1000);
		WebElement day = driver.findElement(By.id("day"));
		Select s=new Select(day);//1.selectByVisualText2.index3.value
			Thread.sleep(1000);
		s.selectByIndex(5);
		
		WebElement month = driver.findElement(By.id("month"));
		Select s1=new Select(month);
		Thread.sleep(1000);
		s1.selectByVisibleText("Nov");
		Thread.sleep(1000);
         WebElement year = driver.findElement(By.id("year"));
         Select s2=new Select(year);
         
         s2.selectByValue("1930");
         
	}

	
	}


