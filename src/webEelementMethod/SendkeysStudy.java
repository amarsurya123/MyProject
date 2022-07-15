package webEelementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendkeysStudy {

	public static void main(String[] args) throws InterruptedException {
     
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\automotion\\files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("7038706967");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("amarsurya");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);

		driver.quit();
		
		
	}

}
