package testAnnotations;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag41 {
  @Test(priority=0)
  public void f() 
  {
	  Reporter.log("f",true);
  }
  @Test
  public void a() 
  {
	  Reporter.log("a",true);
  }
  @Test
  public void m() 
  {
	  Reporter.log("m",true);
  }
  @Test
  public void j() 
  {
	  Reporter.log("j",true);
  }
  @Test
  public void i() 
  {
	  Reporter.log("i",true);
  }
  @Test(priority=7)
  public void q() 
  {
	  Reporter.log("q",true);
  }
  @Test(priority=2)
  public void e() 
  {
	  Reporter.log("e",true);
  }
  @Test
  public void l() 
  {
	  Reporter.log("l",true);
  }
  @Test(priority=1)
  public void n() 
  {
	  Reporter.log("n",true);
  }
}
