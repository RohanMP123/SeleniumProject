package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario19 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rohan\\OneDrive\\Desktop\\WCSM7//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);

		driver.get("https://www.bluestone.com/");
		driver.findElement(By.xpath("//span[@id='denyBtn']")).click();
		WebElement Target = driver.findElement(By.xpath("//a[@title='Coins']"));
		Actions act = new Actions(driver);
		act.moveToElement(Target).perform();
		driver.findElement(By.xpath("//span[@data-p='l-gold-coins-weight-5gms,m']")).click();
		Thread.sleep(4000);
		driver.close();


	}

}
