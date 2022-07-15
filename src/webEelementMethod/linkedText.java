package webEelementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkedText {

	public static void main(String[] args) throws InterruptedException 
	{
 
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\automotion\\files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Thread.sleep(100);
		driver.findElement(By.linkText("Gmail")).click();
		
		

	}

}
