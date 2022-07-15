package dropDownStudy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleListBoxStudy {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
	Thread.sleep(1000);
	driver.manage().window().maximize();
	
	WebElement cars = driver.findElement(By.id("cars"));
	
	Select s=new Select(cars);
	
	s.selectByIndex(2);
	Thread.sleep(1000);
    s.selectByValue("saab");
    s.selectByVisibleText("Volvo");
	
    System.out.println(s.isMultiple());
    s.deselectByIndex(2);
	Thread.sleep(1000);
     s.deselectByVisibleText("Volvo");
 	Thread.sleep(1000);
//    List<WebElement> l = s.getAllSelectedOptions();
//    for(int i=0;i<=l.size()-1;i++)
//    {   System.out.println(l.get(i).getText());
//    }
 	
 	WebElement f = s.getFirstSelectedOption();
 	    String g=f.getText();
 	    System.out.println("My Favourate car is "+g);
 }

}
