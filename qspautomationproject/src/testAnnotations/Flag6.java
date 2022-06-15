package testAnnotations;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag6 {
  @Test
  public void login() 
  {
	  Reporter.log("login",true);
  }
  @Test(dependsOnMethods="login")
  public void Createuser()
  {
	  AssertJUnit.fail();
	 Reporter.log("Creater User",true); 
  }
  @Test(dependsOnMethods="Createuser",alwaysRun=true)
  public void logout()
  {
	  Reporter.log("logout",true);
  }
}
