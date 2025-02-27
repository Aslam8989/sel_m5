package dataDriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelTotalRow {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fl=new FileInputStream("./src/test/resources/snippet/Bike_Sheet1.xlsx");
		
		Workbook wb = WorkbookFactory.create(fl);
		
		
		Sheet sh = wb.getSheet("Sheet1");
		
		for (int i = 0; i <= sh.getLastRowNum(); i++) {
			System.out.println(sh.getRow(i).getCell(0).getStringCellValue());
		}
		
	}

}
