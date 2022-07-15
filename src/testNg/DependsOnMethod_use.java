package testNg;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethod_use
{
     @Test
     public void D()
     {
         Assert.fail(); 
    	 Reporter.log("test Method D is running ", true);
     }
     @Test(dependsOnMethods = {"D"})
     public void C()
     {
    	 Reporter.log("Test Method C is running", true);
     }
     @Test
     public void B()
     {
    	 Reporter.log("Test Method B is running ", true);
     }
     @Test
     public void A()
     {
    	 Reporter.log("Test Method A is running", true);
     }
}
