package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Scenario1 {

  public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
    ChromeDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.gmail.com");
    Thread.sleep(4000);
    driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("saurabhbhange2000@gmail.com");
    driver.findElement(By.xpath("//span[.='Next']")).click();
  

  }

}