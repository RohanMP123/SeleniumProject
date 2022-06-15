package MouseActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);

		driver.get("https://www.bluestone.com/?utm_campaign=&utm_medium=cpc&utm_source=google&gclid=CjwKCAjw9-KTBhBcEiwAr19ig_7-id3UiAxjpFckgBfXpZCHxTQ9Qsq9PWYGfzPOXVSPqqbkso40IxoCE9AQAvD_BwE");
        
		driver.findElement(By.xpath("//span[@class='deny-btn']")).click();
		Thread.sleep(4000);
		WebElement Target = driver.findElement(By.xpath("//li[@class='menuparent repb']/a[@title='Rings']"));
		Actions act=new Actions(driver);
		act.moveToElement(Target).perform();
	}

}
