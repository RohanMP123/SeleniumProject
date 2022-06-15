package Assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAssignment {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);

		driver.get("https://www.selenium.dev/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[contains(text(),'Downloads')]")).click();
		WebElement target = driver.findElement(By.xpath("//h1[@class='display-1 mt-0 mt-md-5 pb-1']"));

		// Right click
		Actions act = new Actions(driver);
		act.contextClick(target).perform();

		// Robot Action
		Robot act1 = new Robot();
		for(int i=0;i<10;i++)
		{
			act1.keyPress(KeyEvent.VK_DOWN);
			act1.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(1000);
		}
		Thread.sleep(2000);
		act1.keyPress(KeyEvent.VK_ENTER);
		act1.keyRelease(KeyEvent.VK_ENTER);

	}

}
