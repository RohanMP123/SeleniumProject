package assertion;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertioninTestNG {
	@Test
	public void testcase() 
	{
		Reporter.log("launch the browser",true);
		Reporter.log("launch the web app by entring the url",true);
		Reporter.log("verify the login page title",true);
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(false, true);
		Reporter.log("perform login",true);
		Assert.assertEquals(true, true);
		Reporter.log("verify home page title",true);
		Reporter.log("create user",true);
		Reporter.log("create contact",true);
		softassert.assertAll();

	}
}
