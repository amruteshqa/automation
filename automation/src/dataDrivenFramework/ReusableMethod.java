package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReusableMethod {

	public String readexcel(String Excelpath,String sheetname,int rowcount,int cellcount) throws  EncryptedDocumentException,IOException
	{
		FileInputStream fs=new FileInputStream(Excelpath);
		Workbook wb=WorkbookFactory.create(fs);
		org.apache.poi.ss.usermodel.Sheet sh = wb.getSheet(sheetname);
	    Row rw=sh.getRow(rowcount);
	    Cell cl=rw.getCell(cellcount);
	    String data = cl.getStringCellValue();
	    
		return data;
        
	}

}


