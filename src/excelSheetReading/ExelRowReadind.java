package excelSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExelRowReadind {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
       File f1=new File("D:\\Software Testing\\automotion\\Book2.xlsx");
       Workbook book = WorkbookFactory.create(f1);
       Sheet sheet = book.getSheet("Sheet1");
	   Row row = sheet.getRow(0);
	   Cell cell = row.getCell(0);
	   String value = cell.getStringCellValue();
	   
	   System.out.println(value);
	   System.out.println("==========");
			   
	   for(int i=0;i<=4;i++) //column reading
	   {
		   String value1 = sheet.getRow(0).getCell(i).getStringCellValue();
		   System.out.println(value1);
	   }
	System.out.println("===========");
	for(int i=0;i<=8;i++) //row reading
	{
		String result = sheet.getRow(i).getCell(1).getStringCellValue();
		System.out.println(result);
	}
	System.out.println("===========");
	
	short lastno = sheet.getRow(0).getLastCellNum();//column reading
	 int total = lastno-1;
	System.out.println(total);
	 System.out.println("===========");
	 
	for(int i=0;i<=total;i++) //column reading
	{
		String count = sheet.getRow(0).getCell(i).getStringCellValue();
		System.out.println(count);
	}
	System.out.println("============");
    int lastcell = sheet.getLastRowNum();//row reading
    System.out.println(lastcell);
    System.out.println("============"
    		+ "");
	for(int i=0;i<=lastcell;i++)   //row reading
	{
		String result1 = sheet.getRow(i).getCell(0).getStringCellValue();
		System.out.println(result1);
	}
	
	}

}
