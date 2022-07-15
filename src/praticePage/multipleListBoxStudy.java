package praticePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multipleListBoxStudy {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\automotion\\files\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/select-menu");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        WebElement textbox = driver.findElement(By.id("cars"));
        Select box=new Select(textbox);
        box.selectByIndex(2);
        Thread.sleep(1000);
        box.selectByValue("saab");
        Thread.sleep(1000);
        box.selectByVisibleText("Volvo");
        Thread.sleep(1000);
        System.out.println(box.isMultiple());
        Thread.sleep(1000);
        box.deselectAll();
        
        
	}

}
