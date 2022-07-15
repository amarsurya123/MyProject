package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Intro {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\automotion\\files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//driver.close();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//button[contains(@name,'login')]")).click();
		//Thread.sleep(2000);
		WebElement text = driver.findElement(By.xpath("//h2[contains(text(),'you connect')]"));
		
		System.out.println(text.getText());
		
		}

}
