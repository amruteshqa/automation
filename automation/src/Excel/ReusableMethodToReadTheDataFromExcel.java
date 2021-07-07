package Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReusableMethodToReadTheDataFromExcel {
	
	public String readExcel(String Excelpath,String SheetName,int rowcount,int cellcount) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis =  new FileInputStream(Excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(SheetName);
		Row row = sh.getRow(rowcount);
		Cell cell = row.getCell(cellcount);
		String data = cell.getStringCellValue();
		
		return data;
	}
	
	
}
