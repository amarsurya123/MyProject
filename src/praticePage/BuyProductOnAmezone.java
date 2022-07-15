package praticePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

public class BuyProductOnAmezone {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(100);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mobiles");
		Thread.sleep(100);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(100);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("4500");
//		Thread.sleep(100);
//		driver.findElement(By.xpath(""))
		
		
		
	}

}
