package demoTestng;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class ReadDataDemo {

	@DataProvider
	public static String[][] read() throws Exception {
		String st[][];
		String path = "E:/Login.xlsx";
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("login");
		int rowCount = sh.getPhysicalNumberOfRows();
		int colCount = sh.getRow(0).getLastCellNum();
		st = new String[rowCount - 1][colCount];
		for (int i = 1; i < rowCount; i++) {
			for (int j = 0; j < colCount; j++) {
				Cell cl = sh.getRow(i).getCell(j);
				st[i - 1][j] = cl.toString();
			}

		}
		return st;

	}

}
