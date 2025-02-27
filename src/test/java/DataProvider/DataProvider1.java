package DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 {
	
	@DataProvider
	public Object[][] data() {
		Object a[][]=new Object[2][2];
		a[0][0]=" aslam";
		a[0][1]=" khan";
		a[1][0]=" is";
		a[1][1]=" a good person";
		return a;
	}
	@Test(dataProvider = "data")
	public void demo(String data1,String data2) {
		System.out.println(data1+data2);
	}
}
