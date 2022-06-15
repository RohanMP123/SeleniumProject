package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocatorforInstagram {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");																																	
		
		// login operation
		
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("ttuf877fyy");
    	driver.findElement(By.cssSelector("input[name='password']")).sendKeys("jutyytedu6");
		driver.findElement(By.cssSelector("div[class='             qF0y9          Igw0E     IwRSH      eGOV_         _4EzTm                                                                                                              ']]")).click();

	}
}