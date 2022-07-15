package miscellaneous;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfLinksOnWebpage {

	public static void main(String[] args) {
     System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\automotion\\files\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://vctcpune.com/selenium/practice.html");
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	List<WebElement> links = driver.findElements(By.tagName("a"));
	
	System.out.println(links.size());
	Iterator<WebElement> it = links.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next().getText());
	}
	
	
	
	
	}

}
