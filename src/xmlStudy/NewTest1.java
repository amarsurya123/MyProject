package xmlStudy;

//import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest1 
{
   @Test
   public void MyMethod1()
   {
	  // Assert.fail();
	   Reporter.log("MyMethod 1 is running ", true);
   }
   @Test
   public void MyMethod2()
   {
	  // Assert.fail();
	   Reporter.log("MyMethod 2 is running ", true);
   }
   @Test
   public void MyMethod3()
   {
	   Reporter.log("MyMethod 3 is running ",true);
   }
   @Test
   public void MyMethod4()
   {
	   Reporter.log("MyMethod 4 is running ",true);
   }
   @Test
   public void MyMethod5()
   {
	   Reporter.log("MyMethod 5 is running ",true);
   }
   @Test
   public void MyMethod6()
   {
	   Reporter.log("MyMethod 6 is running ",true);
   }
}
