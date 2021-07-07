package Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fls = new FileInputStream("./data/Testdata.xlsx");//location where the file is stored
		 Workbook wb = WorkbookFactory.create(fls);//Create() makes file ready for read oprn.
		 Sheet sh = wb.getSheet("Valid");//the sheet in which data
		 Row row = sh.getRow(1);//the row in which data is present
		 Cell cell = row.getCell(1);//the cell in which data is present
		 String data = cell.getStringCellValue();//to get string present in specified cell
		 System.out.println(data);//print data
	
	}

}
