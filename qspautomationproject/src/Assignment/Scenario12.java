package Assignment;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Scenario12 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rohan\\OneDrive\\Desktop\\WCSM7//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);

		driver.get("https://www.bluestone.com/");
		driver.findElement(By.xpath("//span[@id='denyBtn']")).click();
	
		WebElement Target =	driver.findElement(By.xpath("//span[.='Offers ']"));
		Actions act=new Actions(driver);
		act.moveToElement(Target).perform();
		Target.click();
		driver.findElement(By.xpath("//span[@class='title style-fill i-right']/span[.='Offers']")).click();
		driver.findElement(By.xpath("//span[@data-p='jewellery@filter@20+percent+making+charge+off!!']")).click();
		driver.close();
		

	}

}
