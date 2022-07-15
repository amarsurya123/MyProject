package webEelementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelectedStudy {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		WebElement result = driver.findElement(By.id("checkBoxOption1"));
		if(result.isSelected())
		{
			System.out.println("chackbox is selacted");
		}
		else
		{
			System.out.println("chackbox is not selcted");
		}
		result.isSelected();
		if(result.isSelected())
		{
			System.out.println("secting is now");
		}
		else
		{
			System.out.println("secting process");
		}
		

	}

}
