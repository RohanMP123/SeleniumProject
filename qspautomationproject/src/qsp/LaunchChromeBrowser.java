package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) throws InterruptedException	
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); //open the chrome browser
		driver.get("https://www.instagram.com");
		Thread.sleep(10000);
		driver.close();

	}
}