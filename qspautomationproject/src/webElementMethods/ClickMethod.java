package webElementMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethod {

	public static void main(String[] args) throws InterruptedException {
      
         System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
         ChromeDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver.get("http://rohan/login.do");
          
         WebElement obj = driver.findElement(By.xpath("//a[@class='initial']"));
         Thread.sleep(4000);
         obj.click();
         

	}

}
