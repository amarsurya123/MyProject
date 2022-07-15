package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableEg1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\automotion\\files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html#top");
        Thread.sleep(100);
        List<WebElement> HeaderText = driver.findElements(By.xpath("//table//tr[1]"));
	    for(WebElement h1:HeaderText)
	    {
	    	System.out.println(" ||"+h1.getText()+" ||");
	    }
	    System.out.println();
	    List<WebElement> midText = driver.findElements(By.xpath("//td[text()='Selenium Webdriver with Java Basics + Advanced + Interview Guide']"));
	    for(WebElement h2:midText)
	    {
	    	System.out.println(h2.getText());
	    }
	    System.out.println();
	    List<WebElement> row3 = driver.findElements(By.xpath("//table//tr[3]"));
	    for(WebElement h3:row3)
	    {
	    	System.out.println(h3.getText()+" || ");
	    }
	
	}

}
