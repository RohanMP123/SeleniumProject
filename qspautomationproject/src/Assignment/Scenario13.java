package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario13 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
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
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@data-p='jewellery@filter@30+percent+making+charge+off!!']")).click();
		driver.close();

	}

}
