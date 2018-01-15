package GenericClasses;

import java.lang.reflect.Method;
import org.testng.annotations.DataProvider;

import Excel.Xls_Reader;
public class DataProvider1 extends Baseclass{

	@DataProvider(name = "SampleDataProvider")
	public static Object[][] getData(Method m){
		Object[][] data = null;
		if(m.getName().equals("doLoginTest"))
		{
			xls = new Xls_Reader(prop.getProperty("cerpsxlsx"));
			int rows = xls.getRowCount("LoginTest");
			int cols = xls.getColumnCount("LoginTest");
			data = new Object[rows-1][cols];
			for(int rNum=2;rNum<=rows;rNum++){
				for(int cNum=0;cNum<cols;cNum++){
					System.out.println(xls.getCellData("LoginTest", cNum, rNum));
					data[rNum-2][cNum] = xls.getCellData("LoginTest", cNum, rNum);
				}
			}
			return data;
		}
		return null;
	}
}
