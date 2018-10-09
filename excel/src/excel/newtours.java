package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import excel.Utility.*;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class newtours {

	
	public static void main(String[] args) throws IOException {
		File exc = new File("C:\\Users\\mounika.sanjeevi\\Downloads\\Book1.xlsx");
		FileInputStream fis = new FileInputStream(exc);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		WebDriver driver = Utility.startBrowser("chrome", "http://newtours.demoaut.com");
		
		//String s1 = sheet1.getRow(0).getCell(0).getStringCellValue();
		//String s2 = sheet1.getRow(0).getCell(1).getStringCellValue();
		int noofrows = sheet1.getLastRowNum();
		for (int i = 0;i<noofrows;i++)
		{
		driver.findElement(By.name("userName")).sendKeys(sheet1.getRow(0).getCell(0).getStringCellValue());
		driver.findElement(By.name("password")).sendKeys(sheet1.getRow(0).getCell(1).getStringCellValue());
		driver.findElement(By.name("login")).click();
		}
		
	}
	
}
