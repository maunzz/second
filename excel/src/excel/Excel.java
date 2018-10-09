package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Excel {
	
public static void main(String[] args) throws Exception,IOException {
		
		File exc = new File("C:\\Users\\mounika.sanjeevi\\Downloads\\Book1.xlsx");
		FileInputStream fis = new FileInputStream(exc);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		
		String s1 = sheet1.getRow(0).getCell(0).getStringCellValue();
		String s2 = sheet1.getRow(0).getCell(1).getStringCellValue();
		
		System.out.println(s1);
		System.out.println(s2);
		
		wb.close();
		
	}

}
