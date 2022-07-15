package testNGlistener;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testNGlistener.Listener.class)
public class MyTestClass {
        
	     @Test
	     public void MyTest()
	     {
	    	// Assert.fail();
	     }
	
	
	     @Test(dependsOnMethods={"MyTest"})
         public void MyMethod() 
         {
	    	 Assert.fail();
        	 Reporter.log("hi gm",true);
        	 
         }
}
