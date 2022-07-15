package testNg;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationStudy2 
{
  @Test
  public void MyTest3()
  {
	  Reporter.log("test Method is running ",true);
  }
  @Test
  public void MyTest4()
  {
	  Reporter.log("test Method is running ",true);
  }
  @BeforeMethod
  public void login()
  {
	  Reporter.log("Befor Method is running ",true);
  }
  @AfterMethod
  public void logout()
  {
	  Reporter.log("After Method is running",true);
  }
  @BeforeClass
  public void launchBrowser()
  {
	  Reporter.log("Befor Class is running ", true);
  }
  @AfterClass
  public void CloseBrowser()
  {
	  Reporter.log("After Class is running ", true);
  }
  
}
