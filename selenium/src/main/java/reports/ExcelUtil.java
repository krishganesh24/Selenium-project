package reports;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {

	
	public Object[][] readExcel() throws IOException {

			XSSFWorkbook wbook = new XSSFWorkbook("./data/CreateLead.xlsx");
			XSSFSheet sheet = wbook.getSheetAt(0);
			int rowno = sheet.getLastRowNum();
			int colno = sheet.getRow(0).getLastCellNum();
			
			Object[][] data = new Object[rowno][colno];
			
			for(int i =1;i<=rowno;i++) {
				XSSFRow row = sheet.getRow(i);
				for (int j=0;j< colno; j++) {
					
					String value = row.getCell(j).getStringCellValue();
					System.out.println(value);
					data [i-1][j]= value;
					
				}
			}
			
			wbook.close();
			return data;
					
				}
		
	}


