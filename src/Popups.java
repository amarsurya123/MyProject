import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popups {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
        Thread.sleep(100);
        driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
        Thread.sleep(100);
        String AnotherTab = driver.getWindowHandle();
        System.out.println(AnotherTab);
        Set<String> AllWindowIds = driver.getWindowHandles();
        System.out.println(AllWindowIds);
        ArrayList<String> al=new ArrayList<>(AllWindowIds);
        for(int i=0;i<=al.size()-1;i++)
        {
        	al.get(i);
        }
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("(//span[@class='menu-text'])[7]")).click();
//        driver.quit();
        
        String FirstPageId = al.get(1);
        
        driver.switchTo().window(FirstPageId);
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        
        driver.findElement(By.linkText("Training")).click();
        
        
	}

}
