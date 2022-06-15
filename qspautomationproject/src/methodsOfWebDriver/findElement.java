package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class findElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://rohan/login.do");
		driver.manage().window().maximize();
		WebElement sourabh = driver.findElement(By.name("username"));
		sourabh.sendKeys("admin");
		System.out.println(sourabh);
		WebElement sourabh1 = driver.findElement(By.name("pwd"));
		sourabh1.sendKeys("manager");
		System.out.println(sourabh1);

	}

}
