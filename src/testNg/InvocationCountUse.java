package testNg;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class InvocationCountUse 
{
  private static final String InvocationCount = null;

         @Test(invocationCount = 4)
         public void A() 
        {
	       Reporter.log("mymethod is running ", true);
        }

        @BeforeClass
        public void login()
        {
	      Reporter.log("Aftermethod is running ",true);
        }
}
