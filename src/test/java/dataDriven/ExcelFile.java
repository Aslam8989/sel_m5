package dataDriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fl=new FileInputStream("./src/test/resources/snippet/Bike_Sheet1.xlsx");
		//create workbook/Fetch the workbook
		Workbook Workbook = WorkbookFactory.create(fl);
		//Fetch the sheet
		Sheet sh = Workbook.getSheet("Sheet1");
		//Fetch the row
		Row row = sh.getRow(1);
		
		//Fetch the cell
		Cell cell = row.getCell(0);
		
		//Fetch the data
		String data = cell.getStringCellValue();
		System.out.println(data);

		
	}

}
