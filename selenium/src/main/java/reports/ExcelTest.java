package reports;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelTest {

	
	public static void main(String[] args) throws IOException {

		XSSFWorkbook wbook = new XSSFWorkbook("./data/Test.xlsx");
		XSSFSheet sheet = wbook.getSheetAt(0);
		int lastRowNum = sheet.getLastRowNum();
		int lastCellNum = sheet.getRow(0).getLastCellNum();
		System.out.println("Row count="+lastRowNum+" Cell count="+ lastCellNum);
		
		for(int i =1;i<=lastRowNum;i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j=0;j< lastCellNum; j++) {
				
				String value = row.getCell(j).getStringCellValue();
				System.out.println(value);
				
			}
		}
		XSSFRow row1 = sheet.getRow(1);
		String Value1=row1.getCell(1).getStringCellValue();
		System.out.println(Value1);
		
		
		
		
		
		wbook.close();
				
			}
		
	}


