package GenericClasses;

import java.lang.reflect.Method;
import org.testng.annotations.DataProvider;
import Excel.Xls_Reader;

public class DataProviderTest extends TestBase {
	@DataProvider(name = "SampleDataProvider")
	public static Object[][] getData(Method m) {
		if (m.getName().equals("hres")) { //Method name
			Xls_Reader xls = new Xls_Reader(prop.getProperty("cerpsxlsx")); //excel path
			int rows = xls.getRowCount("hr"); //Sheet name
			int cols = xls.getColumnCount("hr"); //Sheet name
			Object data[][] = new Object[rows - 1][cols];

			for (int rNum = 2; rNum <= rows; rNum++) {
				for (int cNum = 0; cNum < cols; cNum++) {
					System.out.println(xls.getCellData("hr", cNum, rNum)); //Sheet name
					data[rNum - 2][cNum] = xls.getCellData("hr", cNum, rNum); //Sheet name
				}
			}
			return data;
		}
		else if (m.getName().equals("genoffltr")) { 
			Xls_Reader xls = new Xls_Reader(prop.getProperty("cerpsxlsx"));
			int rows = xls.getRowCount("offerletter");
			int cols = xls.getColumnCount("offerletter");
			Object data[][] = new Object[rows - 1][cols];

			for (int rNum = 2; rNum <= rows; rNum++) {
				for (int cNum = 0; cNum < cols; cNum++) {
					System.out.println(xls.getCellData("offerletter", cNum, rNum));
					data[rNum - 2][cNum] = xls.getCellData("offerletter", cNum, rNum);
				}
			}
			return data;
		}
		else if (m.getName().equals("newcrrs")) { 
			Xls_Reader xls = new Xls_Reader(prop.getProperty("cerpsxlsx"));
			int rows = xls.getRowCount("crrs");
			int cols = xls.getColumnCount("crrs");
			Object data[][] = new Object[rows - 1][cols];

			for (int rNum = 2; rNum <= rows; rNum++) {
				for (int cNum = 0; cNum < cols; cNum++) {
					System.out.println(xls.getCellData("crrs", cNum, rNum));
					data[rNum - 2][cNum] = xls.getCellData("crrs", cNum, rNum);
				}
			}
			return data;
		}
		else if (m.getName().equals("NewVendor")) { 
			Xls_Reader xls = new Xls_Reader(prop.getProperty("cerpsxlsx"));
			int rows = xls.getRowCount("newvendor");
			int cols = xls.getColumnCount("newvendor");
			Object data[][] = new Object[rows - 1][cols];

			for (int rNum = 2; rNum <= rows; rNum++) {
				for (int cNum = 0; cNum < cols; cNum++) {
					System.out.println(xls.getCellData("newvendor", cNum, rNum));
					data[rNum - 2][cNum] = xls.getCellData("newvendor", cNum, rNum);
				}
			}
			return data;
		}
		else if (m.getName().equals("newledgr")) { 
			Xls_Reader xls = new Xls_Reader(prop.getProperty("cerpsxlsx"));
			int rows = xls.getRowCount("NewLedger");
			int cols = xls.getColumnCount("NewLedger");
			Object data[][] = new Object[rows - 1][cols];

			for (int rNum = 2; rNum <= rows; rNum++) {
				for (int cNum = 0; cNum < cols; cNum++) {
					System.out.println(xls.getCellData("NewLedger", cNum, rNum));
					data[rNum - 2][cNum] = xls.getCellData("NewLedger", cNum, rNum);
				}
			}
			return data;
		}
		else if (m.getName().equals("accEntry")) { 
			Xls_Reader xls = new Xls_Reader(prop.getProperty("cerpsxlsx"));
			int rows = xls.getRowCount("AccEntry");
			int cols = xls.getColumnCount("AccEntry");
			Object data[][] = new Object[rows - 1][cols];

			for (int rNum = 2; rNum <= rows; rNum++) {
				for (int cNum = 0; cNum < cols; cNum++) {
					System.out.println(xls.getCellData("AccEntry", cNum, rNum));
					data[rNum - 2][cNum] = xls.getCellData("AccEntry", cNum, rNum);
				}
			}
			return data;
		}
		else if (m.getName().equals("newpartentry")) { 
			Xls_Reader xls = new Xls_Reader(prop.getProperty("cerpsxlsx"));
			int rows = xls.getRowCount("Partentry");
			int cols = xls.getColumnCount("Partentry");
			Object data[][] = new Object[rows - 1][cols];

			for (int rNum = 2; rNum <= rows; rNum++) {
				for (int cNum = 0; cNum < cols; cNum++) {
					System.out.println(xls.getCellData("Partentry", cNum, rNum));
					data[rNum - 2][cNum] = xls.getCellData("Partentry", cNum, rNum);
				}
			}
			return data;
		}
		else if (m.getName().equals("invEntry")) { 
			Xls_Reader xls = new Xls_Reader(prop.getProperty("cerpsxlsx"));
			int rows = xls.getRowCount("InvEntry");
			int cols = xls.getColumnCount("InvEntry");
			Object data[][] = new Object[rows - 1][cols];

			for (int rNum = 2; rNum <= rows; rNum++) {
				for (int cNum = 0; cNum < cols; cNum++) {
					System.out.println(xls.getCellData("InvEntry", cNum, rNum));
					data[rNum - 2][cNum] = xls.getCellData("InvEntry", cNum, rNum);
				}
			}
			return data;
		}
		else if (m.getName().equals("multaccentry1")) { 
			Xls_Reader xls = new Xls_Reader(prop.getProperty("cerpsxlsx"));
			int rows = xls.getRowCount("MultAccEntry");
			int cols = xls.getColumnCount("MultAccEntry");
			Object data[][] = new Object[rows - 1][cols];

			for (int rNum = 2; rNum <= rows; rNum++) {
				for (int cNum = 0; cNum < cols; cNum++) {
					System.out.println(xls.getCellData("MultAccEntry", cNum, rNum));
					data[rNum - 2][cNum] = xls.getCellData("MultAccEntry", cNum, rNum);
				}
			}
			return data;
		}
		return null;
	}
}