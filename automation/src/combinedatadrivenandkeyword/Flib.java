package combinedatadrivenandkeyword;

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

	//generic reusable method to perform read operation
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

	//generic reusable method to get the row count
	public int  getRowCount(String excelpath,String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);//make the excel file ready for read operation
		Sheet sh = wb.getSheet(sheetName);// go to that sheet
		int rc = sh.getLastRowNum();
		return rc;
	}


	//generic reusable method to perform write operation
	public void writeExcel(String excelpath,String sheetName,int rowcount,int cellCount,String data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);//make the excel file ready for read operation
		Sheet sh = wb.getSheet(sheetName);// go to that sheet
		Row row = sh.getRow(rowcount);//go to the required  row

		Cell cell = row.createCell(cellCount);
		cell.setCellValue(data);
		FileOutputStream fos = new FileOutputStream(excelpath);
		wb.write(fos);
		wb.close();
	}

	//generic reusable method to perform get data operation
	public String readPropertyFile(String proppath, String key) throws IOException 
	{

		FileInputStream fis = new FileInputStream(proppath);
		Properties prop = new Properties();//object of properties

		prop.load(fis);//load method of prop
		String data = prop.getProperty(key);//getProperty method of prop to get data

		return data;

	}

}


