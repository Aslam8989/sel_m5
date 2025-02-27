package dataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class usingDataFromProperties {

	public static void main(String[] args) throws IOException {
		//step 1:convert the physical value into java obj
		FileInputStream fs=new FileInputStream("./src/test/resources/commonData.properties");
		
		//step 2:create the empty properties obj
		Properties p=new Properties();
		
		//step 3: load the properties
		p.load(fs);
		//long =Long
		//step 4: fetch the properties
	Object un = p.getProperty("Pwd");
	
	System.out.println(un);
	}

}
