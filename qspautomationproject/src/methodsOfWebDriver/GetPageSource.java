package methodsOfWebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/rohan/OneDrive/Desktop/html/dropdownsingle.html");
		String sourceCodeOfWebPage=driver.getPageSource();
	    System.out.println(sourceCodeOfWebPage);
	    
		

	}

}
