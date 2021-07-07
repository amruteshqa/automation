package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	
	{
		FileInputStream fis = new FileInputStream("./data/Sample.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("login");
		Row row = sheet.getRow(4);//Row value
		Cell cell = row.getCell(1);//column value
		String data = cell.getStringCellValue();
		System.out.println(data);

	}
	
	
}
