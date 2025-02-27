package dataDriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class dataBack {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fl=new FileInputStream("/src/test/resources/commonData.properties");
		
		Properties p=new Properties();
		p.load(fl);
		
		//writing data back
		p.put("Name","Palan");
		
		//save prop file
		FileOutputStream fos=new FileOutputStream("/src/test/resources/commonData.properties");
		p.store(fos, "updated successfully");
		
	}

}
