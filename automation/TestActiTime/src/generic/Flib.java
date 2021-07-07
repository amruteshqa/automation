package generic;

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

	//used to read data from excel
	public String readExcel(String excelpath, String sheetName, int rowcount, int cellCount)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row row = sh.getRow(rowcount);
		Cell cell = row.getCell(cellCount);
		String data = cell.getStringCellValue();
		return data;
	}

	//used to get rowCount
	public int getRowCount(String excelpath, String sheetName) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		int rc = sh.getLastRowNum();
		return rc;
	}

	//used to read the property data
	public String readPropertyData(String proppath, String key) throws IOException {
		FileInputStream fis = new FileInputStream(proppath);

		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;

	}

	//used to write the data in excel file
	public void writeExcel(String excelpath, String sheetName, int rowcount, int cellCount, String data)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row row = sh.getRow(rowcount);

		Cell cell = row.createCell(cellCount);
		cell.setCellValue(data);
		FileOutputStream fos = new FileOutputStream(excelpath);
		wb.write(fos);
		wb.close();

	}

}
