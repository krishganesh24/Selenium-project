package week6homework;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelRead {

	
	public static void main(String[] args) throws IOException {
				
		XSSFWorkbook work = new XSSFWorkbook("./data/Test.xlsx");
		XSSFSheet sheet = work.getSheetAt(0);
		XSSFCell value=sheet.getRow(1).getCell(2);
		System.out.println(value);
		
		work.close();	
	}

}
