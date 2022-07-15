package testNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priorityuse {
      private static final String priority = null;

	@Test(priority = 4 )
        public void A() 
      {
        Reporter.log("TextMethod A is runnnning ", true);
      }
	@Test(priority = -1)
	public void B()
	{
		Reporter.log("TestMethod B is running ", true);
	}
	@Test(priority = -2)
	public void C()
	{
		Reporter.log("TestMethod C is running ", true);
	}
	@Test(priority = 0)
	public void D()
	{
		Reporter.log("TestMethod D is running ", true);
	}


}
