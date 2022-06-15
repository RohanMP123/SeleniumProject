package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cleartrip {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://me.cleartrip.com/?utm_source=google&utm_medium=cpc&utm_campaign=BR_Cleartrip-Desktab&dxid=CjwKCAjwj42UBhAAEiwACIhADtZzaYAX0lMoAd6Fd2MZgLexg_dLdnSWl2TqOEb7Z3QeLh3nzI8V6hoCHxEQAvD_BwE&gclid=CjwKCAjwj42UBhAAEiwACIhADtZzaYAX0lMoAd6Fd2MZgLexg_dLdnSWl2TqOEb7Z3QeLh3nzI8V6hoCHxEQAvD_BwE");
	    WebElement a = driver.findElement(By.xpath("//input[@class='field bw-1 bs-solid w-100p p-2 box-border br-4 fs-2 c-neutral-900 h-8 bc-neutral-100 c-neutral-900 focus:bc-secondary-500 flex flex-middle flex-between t-all fs-2 focus:bc-secondary-500 bg-transparent bc-secondary-500 pr-2 pl-3 pt-2 pb-2 ba br-4 h-8 null"));
	//	a.sendKeys("Goa");
	//	a.click();
//		driver.findElement(By.xpath("//input[@class='field bw-1 bs-solid w-100p p-2 box-border br-4 fs-2 c-neutral-900 h-8 bc-neutral-100 c-neutral-900 focus:bc-secondary-500 flex flex-middle flex-between t-all fs-2 focus:bc-secondary-500 bg-transparent bc-neutral-100 pr-2 pl-3 pt-2 pb-2 ba br-4 h-8']"));

	}

}
