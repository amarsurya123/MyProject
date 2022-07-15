package kiteAppUtility_Packege;
import java.io.File;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import net.bytebuddy.utility.RandomString;
public class Utility 
{
private static final POIFSFileSystem MyFile = null;
public static String readDataFormExcel(int row, int cell) throws 
EncryptedDocumentException, IOException
{
	System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Selenium\\chromedriver_win32\\chromedriver.exe");
    Sheet mySheet = WorkbookFactory.create(MyFile).getSheet("Sheet1");
    String myValue = 
    mySheet.getRow(row).getCell(cell).getStringCellValue();
    return myValue;
}
    public static void takeScreenshot(WebDriver driver) throws IOException
{
    File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    String random=RandomString.make(3);
    File dest= new File("D:\\Software Testing\\Selenium\\screnshot"+random+".png");
    FileHandler.copy(src, dest);
}
}