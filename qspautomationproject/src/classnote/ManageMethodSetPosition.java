package classnote;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethodSetPosition {
	
	public static void main(String[] args)  {
		
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		//set position of the browser
		                               //x, y
		Point targetPosition = new Point(10,150);
		driver.manage().window().setPosition(targetPosition);
		

 }
}