package assignment2.Week5;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datalibrary {

	public static String[][] readvalue() throws IOException {
		//path to get excel
		XSSFWorkbook excel= new XSSFWorkbook("./Excel/SalesforceTestNG.xlsx");
		//specific sheet in excel
		 XSSFSheet sheet = excel.getSheetAt(0);
		 
		 int rowCount = sheet.getLastRowNum();
		 short cellCount = sheet.getRow(1).getLastCellNum();

			//assign and declare value
			String[][] data=new String[rowCount][cellCount];
			for (int i = 1; i <= rowCount; i++) {
				for (int j = 0; j < cellCount ; j++) {
				
					String stringCellValue = sheet.getRow(i).getCell(j).getStringCellValue();
					//declare value to data provider
					data[i-1][j] = stringCellValue;
					
				}
			}
		        	//close 
					excel.close();
					return data;
		
	}
}
