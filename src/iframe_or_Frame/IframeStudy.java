package iframe_or_Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IframeStudy {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		driver.switchTo().frame("courses-iframe");
		WebElement selectbutton = driver.findElement(By.xpath("(//a[@rel='noopener noreferrer'])[1]"));
		selectbutton.click();
//		Thread.sleep(2000);
//		driver.switchTo().parentFrame();
		Thread.sleep(1000);
		WebElement opentabButton = driver.findElement(By.id("opentab"));
		opentabButton.click();
		driver.findElement(By.id("dropdown-class-example")).click();
        WebElement opendropdownbox = driver.findElement(By.id("dropdown-class-example"));
		Select s=new Select(opendropdownbox);
		s.selectByIndex(0);
		s.selectByValue("option2");
	

	}

}
