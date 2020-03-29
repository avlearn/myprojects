package tests;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReadXlData();
	}

	public static void ReadXlData() {
		String projPath = System.getProperty("user.dir");
		
		XSSFWorkbook wb = null;
		try {
			wb = new XSSFWorkbook(projPath+"/src/main/resources/excel/data1.xlsx");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getCause());
		}
		
		XSSFSheet ws = wb.getSheet("Sheet1");
		int rc = ws.getPhysicalNumberOfRows();
		int cc = ws.getRow(0).getPhysicalNumberOfCells();
		
		
		System.out.println("Total rows = "+rc);
		System.out.println("Total columns = "+rc);
		
		String uname = ws.getRow(0).getCell(0).getStringCellValue();
		System.out.println("Cell value = "+uname);
		

		
		System.out.println(ws.getRow(1).getCell(0).getStringCellValue());
		
	}
}
