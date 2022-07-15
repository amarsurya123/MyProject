package excelSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExelReadingEg2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		
		File myfile=new File("D:\\Software Testing\\automotion\\Book2.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		
		int rowcount = mysheet.getLastRowNum();
		System.out.println(rowcount);
		int cellcount = mysheet.getRow(rowcount).getLastCellNum()-1;

		for(int i=0;i<=rowcount;i++)
		{
		for(int j=0;j<=cellcount;j++)
		{
			Cell cell = mysheet.getRow(i).getCell(j);
			CellType type = cell.getCellType();
			
			if(type==CellType.STRING)
			{
				System.out.print(cell.getStringCellValue()+" ||");
			}
			else if(type==CellType.BOOLEAN)
			{
				System.out.print(cell.getBooleanCellValue()+" ||");
			}
			else if(type==CellType.NUMERIC)
			{
				System.out.print(cell.getNumericCellValue()+" ||");
			}else if (type==CellType.BLANK) {
				System.out.print("null"+" ||");
			}
		}
		System.out.println();
		
		
		}
		
	}

}
