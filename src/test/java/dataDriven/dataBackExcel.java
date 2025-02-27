package dataDriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class dataBackExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fl=new FileInputStream("./src/test/resources/snippet/Bike_Sheet1.xlsx");
		Workbook wb = WorkbookFactory.create(fl);
		//fetch the row and cell
		Sheet sh = wb.getSheet("Sheet1");
		Row rw = sh.getRow(1);
		Cell cell = rw.getCell(1);
		cell.setCellValue("74,00,000(New)");
		
		//create the row and cell
		Row r = sh.createRow(6);
		Cell c = r.createCell(0);
		c.setCellValue("Total");
		
		Row r1 = sh.createRow(6);
		//Cell c1 = r.createCell(1);
		//c.setCellValue("5,00,0000");
		
		//FileOutputStream fos=new FileOutputStream("./src/test/resources/snippet/Bike_Sheet1.xlsx");
		//wb.write(fos);
		
		wb.close();
	}

}
