package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class myFirstSelineumCode {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\automotion\\files\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/?ef_id=af438b61694e10da1263e9146a06ce86:G:s&s_kwcid=AL!739!10!76484920232329!76485137405439&semcmpid=sem_F1167BY7_Brand_adcenter");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.navigate().to("https://www.amazon.in/?tag=msndeskabkin-21&hvadid=72705283629710&hvqmt=e&hvbmt=be&hvdev=c&ref=pd_sl_7qhce485bd_e");
        //driver.quit();
        Thread.sleep(1500);
        driver.manage().window().maximize();
        driver.navigate().back();
        driver.navigate().forward();
        driver.quit();
        
        
        }

}
