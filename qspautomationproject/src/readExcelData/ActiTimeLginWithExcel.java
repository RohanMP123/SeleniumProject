package readExcelData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLginWithExcel {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://rohan/login.do");
	    
	    driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	    
	    Thread.sleep(1000);
	    
	    FileInputStream fis = new FileInputStream("./data/ActiTimeLoginTestData.xlsx");
	    Workbook wb = WorkbookFactory.create(fis);
	    Sheet sh = wb.getSheet("Validcreds");
	    Row row = sh.getRow(1);
	    Cell cell = row.getCell(0);
	    String username = cell.getStringCellValue();
	    
	    FileInputStream fis1 = new FileInputStream("./data/ActiTimeLoginTestData.xlsx");
	    Workbook wb1 = WorkbookFactory.create(fis1);
	    Sheet sh1 = wb1.getSheet("Validcreds");
	    Row row1 = sh1.getRow(1);
	    Cell cell1 = row1.getCell(1);
	    String password = cell1.getStringCellValue();
	    
	    
	    driver.findElement(By.name("username")).sendKeys(username);
	    driver.findElement(By.name("pwd")).sendKeys(password);
	    driver.findElement(By.id("loginButton")).click();

	}

}
