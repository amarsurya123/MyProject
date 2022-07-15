package sizeAndPosition;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SizeStudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.amazon.in/");
	    Thread.sleep(1000);
	   System.out.println(driver.manage().window().getSize());
	    
	    Dimension d=new Dimension(50,500);
	    
	    driver.manage().window().setSize(d);
	    
	    Point p=new Point(400, -50);
	    driver.manage().window().setPosition(p);
	    
	    JavascriptExecutor js = ((JavascriptExecutor)driver);
	    
	//    js.executeScript("window.scrollBy(800,-60)");
	    WebElement element = driver.findElement(By.linkText("Gift a Smile"));
	    js.executeScript("arguments[0].scrollIntoView(true);",element );
	     element.click();
	    
	    
	    
	}

}
