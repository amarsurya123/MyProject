package testNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOuts_use 
{
        @Test(timeOut = 1000)
      public void MyMethod1() throws InterruptedException
        {
        	Thread.sleep(800);
        	Reporter.log("TestMethod 1 is running ", true);
        }
        @Test(timeOut=1000)
        public void MyMethod2() throws InterruptedException
        {
        	Thread.sleep(1800);
        	Reporter.log("TestMethod 2 is running ", true);
        }
}
