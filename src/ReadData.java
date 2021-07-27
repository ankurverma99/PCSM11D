import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData {
	public static void main(String[] args) throws Exception {
		String path = "E:/Login.xlsx";
		FileInputStream fis = new FileInputStream(path);// mentioning
														// the
														// path
														// of
														// file
		Workbook wb = WorkbookFactory.create(fis);// to load the excel file
		Sheet sh = wb.getSheet("login");// loading the sheet of exxcel
		int rowCount = sh.getPhysicalNumberOfRows();// to get the row count
		int colCount = sh.getRow(0).getLastCellNum();// to get the cell count
														// of 0th row
		for (int i = 0; i < rowCount; i++) {
			for (int j = 0; j < colCount; j++) {
				Cell cl = sh.getRow(i).getCell(j);
				System.out.println(cl);
			}

		}
	}

	public static String readCell(String path, String sheetName, int row, int col) throws Exception {
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Cell cl = sh.getRow(row).getCell(col);
		return cl.toString();
	}

}
