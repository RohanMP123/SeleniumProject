package takesScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShot6Interface {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/downloads/");
		  
		
		// way 6
		WebElement target = driver.findElement(By.xpath("//h1[contains(text(),'Downloads')]"));
		File src = target.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShot/rohan6.png");
		Files.copy(src, dest);
		
		

	}

}
