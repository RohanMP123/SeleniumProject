package readExcelData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import DataDriverFrameWork.Flib;

public class WriteExcelData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./data/ActiTimeLoginTestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Validcreds");
		Row row = sh.getRow(0);
		//-------------------------------------------
		Cell cell = row.createCell(2);
		cell.setCellValue("Status");

		///-------------------------------------------
		FileOutputStream fos = new FileOutputStream("./data/ActiTimeLoginTestData.xlsx");
		wb.write(fos);

		Flib flib = new Flib();
		flib.writeExcelData("./data/ActiTimeLoginTestData.xlsx", "Validcreds", 1, 2,"rohan");

	}

}
