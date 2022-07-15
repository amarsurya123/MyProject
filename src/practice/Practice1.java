package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

	public static void main(String[] args)
	{ 
		  System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Selenium\\chromedriver_win32\\chromedriver.exe");
           WebDriver driver=new ChromeDriver();
           driver.manage().window().maximize();
           driver.get("https://www.amazon.in/");
           driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
           driver.findElement(By.id("twotabsearchtextbox")).sendKeys("redmi 9a");
           driver.findElement(By.id("nav-search-submit-button")).click();
           driver.findElement(By.xpath("(//span[@class='a-size-base a-color-base'])[18]")).click();
           driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[4]")).click();
	}

}
