package TestNg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excell {
	@Test
	public void script() throws Exception {
		String path = "C:\\Users\\Administrator\\OneDrive\\Desktop\\Activator Win\\javaeclip\\Auto\\excelDataProvider\\create.xlsx";
		FileInputStream pth=new FileInputStream (path);
		XSSFWorkbook wb = new XSSFWorkbook(path);
		String pract=wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(pract);
		
		
		
	}
	

}
