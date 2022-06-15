package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FirstTestNGClass {
	@Test
	public void method1()
	{
		Reporter.log("Method1 executed",true);
	}
	
	public void method2()
	{
		Reporter.log("Method2 executed",true);
	}
	@Test
	public void method3()
	{
		Reporter.log("Method3 executed",true);
	}
	@Test
	public void method4()
	{
		Reporter.log("Method4 executed",true);
	}
	@Test
	public void method5()
	{
		Reporter.log("Method5 executed",true);
	}

}
