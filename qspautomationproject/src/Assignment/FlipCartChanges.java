package Assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipCartChanges {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
	    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
     	driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("Samsung f12");
     	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
     	Thread.sleep(2000);
     	driver.findElement(By.xpath("//div[.='SAMSUNG Galaxy F12 (Sea Green, 64 GB)']")).click();
     	 
     	String parentHandle = driver.getWindowHandle();
     	System.out.println(parentHandle);
     	Set<String> allHandles = driver.getWindowHandles();
     	System.out.println(allHandles);
     	for(String wh:allHandles)
     	{
     		if(parentHandle.equals(wh))
     		{
     			driver.switchTo().window(wh);
     		}
     		else
     		{
     			
     		}
     	}
     	
    	driver.findElement(By.xpath("//a[.='128 GB']")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//li[@id='swatch-0-color']")).click();
    	Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@class='_36yFo0']")).sendKeys("411433");
        driver.findElement(By.xpath("//span[@class='_2P_LDn']")).click();
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA ihZ75k _3AWRsL']")).click();

	}

}

