package xmlStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest4 
{
   @Test(groups="regression")
   public void MyMethod1()
   {
	   Reporter.log("MyMethod 1 is running ", true);
   }
   @Test(groups="regression")
   public void MyMethod2()
   {
	   Reporter.log("MyMethod 2 is running ", true);
   }
   @Test(groups="sanity")
   public void MyMethod3()
   {
	   Reporter.log("MyMethod 3 is running ",true);
   }
   @Test
   public void MyMethod4()
   {
	   Reporter.log("MyMethod 4 is running ",true);
   }
  
}
