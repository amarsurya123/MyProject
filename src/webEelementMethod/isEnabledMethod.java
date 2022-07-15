package webEelementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabledMethod {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\automotion\\files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.discoveryplus.in/");
		Thread.sleep(5000);
        driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
        Thread.sleep(1000); 
        WebElement OTPBUTTON = driver.findElement(By.id("//button[text()='Get OTP']"));
        Thread.sleep(2000);
        boolean result = OTPBUTTON.isEnabled();
        System.out.println("result of otpbutton "+result);
       
		
	}

}
