package scenarios;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.scenario;

public class Qspider {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		
		FileInputStream fl=new FileInputStream("C:\\Users\\Mohammed Aslam Khan\\OneDrive\\Desktop\\Test.xlsx");
		
		Workbook w = WorkbookFactory.create(fl);
		
		Sheet sh = w.getSheet("Details");
		for(int i=1;i<5;i++) {
			Row r = sh.getRow(i);
			Cell c = r.getCell(1);
			String URL = c.getStringCellValue();
			System.out.println(URL);
		}
		//LINK
//		Row r = sh.getRow(1);
//		Cell c = r.getCell(1);
//		String URL = c.getStringCellValue();
//		System.out.println(URL);
//		//NAME
//		Row r1 = sh.getRow(2);
//		Cell c1 = r1.getCell(1);
//		String NAME = c1.getStringCellValue();
//		System.out.println(NAME);
//		
//		//EMAIL
//		Row r2 = sh.getRow(3);
//		Cell c2 = r2.getCell(1);
//		String EMAIL = c2.getStringCellValue();
//		System.out.println(EMAIL);
//		
//		//PWD
//		Row r3 = sh.getRow(4);
//		Cell c3 = r3.getCell(1);
//		String pwd = c3.getStringCellValue();
//		System.out.println(pwd);
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		scenario q=new scenario(driver);
		 
		driver.get(URL);
		q.getNAME().sendKeys(NAME);
			q.getEMAIL().sendKeys(EMAIL);
			q.getPWD().sendKeys(pwd);
			q.getRtr_btn().click();
			
			Thread.sleep(2000);
			TakesScreenshot t=(TakesScreenshot)driver;
			File sc = t.getScreenshotAs(OutputType.FILE);
			File f=new File("./aslam/photo.png");
			FileUtils.copyFile(sc,f);
			
			Thread.sleep(4000);
			
			
		
			driver.quit();
		
		
	
	}

}
