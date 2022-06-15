package webElementMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://rohan/login.do");
		 
		WebElement unTextBox = driver.findElement(By.xpath("//input[@name='username']"));
		WebElement passTextBox = driver.findElement(By.xpath("//input[@type='password']"));
		unTextBox.sendKeys("admin");
		passTextBox.sendKeys("admin123");
		Thread.sleep(4000);
		unTextBox.clear();
		passTextBox.clear();
	}

}
