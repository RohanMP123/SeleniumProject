package DataDriverFrameWork;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeInvalidLogin {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://rohan/login.do");
	    
	    driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	    Thread.sleep(2000);
	    Flib flib = new Flib();
	    int rc = flib.getrowCount("./data/ActiTimeLoginTestData.xlsx", "Invalidcreds");
	    
	    for(int i=1;i<=rc;i++)
	    {
	    	String username = flib.readExcelData("./data/ActiTimeLoginTestData.xlsx", "Invalidcreds", i, 0);
	    	String password = flib.readExcelData("./data/ActiTimeLoginTestData.xlsx", "Invalidcreds", i, 1);
	    	
	    	driver.findElement(By.name("username")).sendKeys(username);
		    driver.findElement(By.name("pwd")).sendKeys(password);
		    
		    driver.findElement(By.id("loginButton")).click();
		    Thread.sleep(1000);
		    driver.findElement(By.name("username")).clear();
		    
	    }
	   

	    

	}

}
