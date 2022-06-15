package testngpack;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SecondTestNGClass {
	@Test
	public void a()
	{
		Reporter.log("Test a executed",true);
	}
	@BeforeTest
	public void b()
	{
		Reporter.log("Test b executed",true);
	}
	@AfterTest
	public void c()
	{
		Reporter.log("Test c executed",true);
	}
	@BeforeMethod
	public void d()
	{
		Reporter.log("Test d executed",true);
	}
	@AfterMethod
	public void e()
	{
		Reporter.log("Test e  executed",true);
	}



}
