package KeyWordDriverFrameWork;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {

	

		public static String readExcelData(String excelPath,String Sheetname,int Rowcount,int Cellcount) throws EncryptedDocumentException, IOException {
			
			FileInputStream fis = new FileInputStream(excelPath);
			Workbook wb = WorkbookFactory.create(fis);
		    Sheet sh = wb.getSheet(Sheetname);
		    Row row = sh.getRow(Rowcount);
		    Cell cell = row.getCell(Cellcount);
		    String data = cell.getStringCellValue();
			System.out.println(data);
			return data;
			
				}

		public int getrowCount(String excelPath,String sheetName) throws EncryptedDocumentException, IOException
		{
			FileInputStream fis = new FileInputStream(excelPath);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet(sheetName);
			int rc = sh.getLastRowNum();
			return rc;
			
		}
		public void writeExcelData(String excelPath,String Sheetname,int RowCount,int cellCount,String data) throws EncryptedDocumentException, IOException
		{
			FileInputStream fis = new FileInputStream(excelPath);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet(Sheetname);
			Row row = sh.getRow(RowCount);
			Cell cell = row.createCell(cellCount);
			cell.setCellValue(data);
			FileOutputStream fos = new FileOutputStream(excelPath);
			wb.write(fos);
		}
		public String readPropertyFile(String propPath,String key) throws IOException
		{
			FileInputStream fis = new FileInputStream(propPath);
			Properties prop = new Properties();
			prop.load(fis);
			String value = prop.getProperty(key);
			return value;
		}

}
