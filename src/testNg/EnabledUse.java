package testNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnabledUse 
{
	@Test
	public void A()
	{
		Reporter.log("TestMethod A is running ", true);
	}
	@Test(enabled=true)
    public void B() 
      {
        Reporter.log("TextMethod B is runnnning ", true);
      }
     @Test(enabled = false)
    public void C()
    {
         Reporter.log("test Method C is running ", true);
    }



}
