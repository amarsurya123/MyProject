package excelSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExelCellReading {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File f1=new File("D:\\Software Testing\\automotion\\Book2.xlsx");
		Workbook book = WorkbookFactory.create(f1);
		Sheet sheet = book.getSheet("sheet1");
		Row row = sheet.getRow(3);
		Cell cell = row.getCell(2);
		String value = cell.getStringCellValue();
		System.out.println(value);
		System.out.println("=======");
		
		for(int i=0;i<=4;i++) //column reading
		{
			String result = sheet.getRow(3).getCell(i).getStringCellValue();
			System.out.println(result);
		}
	}

}
