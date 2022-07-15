package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\automotion\\files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        
//        KiteLoginPage Login=new KiteLoginPage(driver);
//        Login.sendLoginID();
//        Login.sendPassword();
//        Login.ClickButton();
//        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
//        
//        pinCod Login1=new pinCod(driver);
//        	Login1.sendPIN();
//             Login1.clickoncontinueButton();
//            
	}

}
