package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableEg2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\automotion\\files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html#top");
        Thread.sleep(100);
        List<WebElement> rows = driver.findElements(By.xpath("//tr"));
        int noOfrows = rows.size();
        System.out.println("No of rows "+noOfrows);
        System.out.println("================");
        List<WebElement> columns = driver.findElements(By.xpath("//th"));
        int NoOfColumns = columns.size();
        System.out.println("no of columns "+NoOfColumns);
	}

}
