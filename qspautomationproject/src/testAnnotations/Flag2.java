package testAnnotations;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag2 {
  @Test(enabled=true)
  public void login() 
  {
	  Reporter.log("login is performed",true);
  }
  @Test(enabled=false)
  public void logout() 
  {
	  Reporter.log("logout is performed",true);
  }
}
