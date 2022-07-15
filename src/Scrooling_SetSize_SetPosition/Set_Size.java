package Scrooling_SetSize_SetPosition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.Argument;

public class Set_Size {

	public static void main(String[] args) throws InterruptedException
	{
//		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Selenium\\chromedriver_win32\\chromedriver.exe");
//	    WebDriver driver=new ChromeDriver();
//	    driver.get("https://www.amazon.in/");
//	    System.out.println(driver.manage().window().getSize());
//	    //Set Size
//	    Dimension d=new Dimension(400,500);
//	    driver.manage().window().setSize(d);
//	    //Set Possion
//	    Point p=new Point(30,20);
//	    driver.manage().window().setPosition(p);
//	    //Scrollby
//	    JavascriptExecutor js = (JavascriptExecutor)driver;
//	    js.executeScript("window.scrollBy(800,-50)");
//	    WebElement element = driver.findElement(By.linkText("Gift a Smile"));
//        element.click();
//        js.executeScript("Argument[0].scrollIntoView(true);",element);
		
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Selenium\\chromedriver_win32\\chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.get("https://vctcpune.com/");
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
         System.out.println(driver.manage().window().getSize());
         
//		Dimension d=new Dimension(500,200);
//		driver.manage().window().setSize(d);
//		
//		Point p=new Point(400,100);
//		driver.manage().window().setPosition(p);
		
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		//js.executeScript("window.scrollBy(80,500)");
		WebElement readMoreButton = driver.findElement(By.xpath("//a[@class='et_pb_button et_pb_button_1_tb_footer et_pb_bg_layout_light']"));
		js.executeScript("arguments[0].scrollIntoView(true);",readMoreButton);
		Thread.sleep(100);
		readMoreButton.click();

		
		
		
		
	}

}
