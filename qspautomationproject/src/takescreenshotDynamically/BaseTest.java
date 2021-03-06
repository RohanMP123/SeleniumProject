package takescreenshotDynamically;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class BaseTest {
	WebDriver driver;
	public void initialization()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(40));
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
	}
	public void failed(String methodName)
	{try {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/"+methodName+".png");
		Files.copy(src, dest);
	}
	catch (Exception e) {

	}
	}
   
}
