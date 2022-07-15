package webEelementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTextMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\automotion\\files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
	    WebElement mytext = driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps')]"));
	    System.out.println(mytext.getText());
	    
	   String actualtext = mytext.getText();
	   String expectedtext ="Facebook helps you connect and share with the people in your life." ; 
	  if( actualtext.equals(expectedtext))
	   {
		   System.out.println("text is matching and text is pass");
	   }
	   else
	   {
		   System.out.println("text is not matching and text is failed");
	   }
			   
	   
	    
		


	}

}
