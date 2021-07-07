package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./data/Sample.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("login");

		Flib flib = new Flib();
		int rc = flib.getRowCount("./data/Sample.xlsx", "login");

		for (int i = 1; i <= rc; i++) {

			Row row = sh.getRow(i);
			for (int j = 0; j < 2; j++) {
				Cell cell = row.getCell(j);
				String data = cell.getStringCellValue();
				System.out.println(data);

			}

		}

	}

}
