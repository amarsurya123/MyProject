package webEelementMethod;

import java.time.Duration;
import java.util.List;

import javax.naming.directory.SearchResult;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class miscellaneous {

	public static void main(String[] args) 
	{
         
		System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\automotion\\files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.findElement(By.name("q")).sendKeys("honda");
		//Thread.sleep(100);
		List<WebElement> searchresult = driver.findElements(By.xpath("(//ul[@class='erkvQe'])[1]//li"));
		for(WebElement search:searchresult)
		{
			System.out.println(search.getText());
		}
		String acpectedResult="Honda shine";
		for(WebElement result:searchresult)
		{
			System.out.println(result.getText());
			
			String actualResult = result.getText();
			
			if(actualResult.equals(acpectedResult))
			{
				result.click();
				break;
			}
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		driver.findElement(By.linkText("image")).click();
		
	}

}
