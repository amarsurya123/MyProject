package excelSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheet1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File source=new File("D:\\Software Testing\\automotion\\Book1.xlsx");
		
		String result = WorkbookFactory.create(source).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(result);
		
		double result1 = WorkbookFactory.create(source).getSheet("Sheet1").getRow(1).getCell(0).getNumericCellValue();
		System.out.println(result1);
		
		boolean result2 = WorkbookFactory.create(source).getSheet("Sheet1").getRow(2).getCell(1).getBooleanCellValue();
	    System.out.println(result2);
	
	}

}
