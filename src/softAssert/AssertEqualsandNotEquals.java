package softAssert;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import dev.failsafe.internal.util.Assert;

public class AssertEqualsandNotEquals
{
	SoftAssert soft=new SoftAssert();
	
    @Test
    public void mymethod1()
    {
       	String a="pune";
    	String b="pune";
    	String c="mumbai";
    	
    	soft.assertEquals(a,b,"tc is pass both are equal");
    	Reporter.log("tc is passed both are equals");
    	
    	soft.assertEquals(a,c,"tc is failed both are not equals");
    	Reporter.log("tc is failed both are not equals");
    	
        soft.assertAll();
    	
    }
	@Test
	public void mymethod2()
	{
		boolean a=true;
		soft.assertTrue(a,"a is not true tc is failed");
		soft.assertAll();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
