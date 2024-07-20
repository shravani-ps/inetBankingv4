package apachepoi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReaddataExl {
	public static void main(String[] args) throws IOException 
	{
		String excelfilepath="C:\\Users\\shravani\\Documents\\excel1.xlsx";
		FileInputStream fi=new FileInputStream(excelfilepath);   //refering excelfile in readmode
		XSSFWorkbook workbook =new XSSFWorkbook(fi);   //constructor refer the workbook
		XSSFSheet sheet=workbook.getSheetAt(0);
		//XSSFSheet sheet=workbook.getSheet("sheet1");
		//using for loop
		 int rows=sheet.getLastRowNum();
		 int cols=sheet.getRow(0).getLastCellNum();
		System.out.println(+rows);
		System.out.println(+cols);
		 
	for(int r=0;r<=rows;r++)
		{
			XSSFRow row=sheet.getRow(r);//present 0th row
	for(int c=0;c<cols;c++)
	{
		XSSFCell cell=row.getCell(c);
	   switch(cell.getCellTypeEnum())
	   {
	    case STRING:System.out.print(cell.getStringCellValue());break;
	    case NUMERIC: System.out.print(cell.getNumericCellValue());break;
	    case BOOLEAN:System.out.print(cell.getBooleanCellValue());break;
	   }
		/*String value=row.getCell(c).toString();     //read the values from a cell
		System.out.print("      "+value);*/
	    System.out.print(" | ");
		
		
	}
	System.out.println(  );
			
		}
	
	///////////////////////using iterator////////////////////////
		
	/*	Iterator rowiterator=sheet.iterator();
		while(rowiterator.hasNext())
		{
			XSSFRow row=(XSSFRow) rowiterator.next();
			Iterator celliterator=row.iterator();
			while(celliterator.hasNext())
			{
				XSSFCell cell=(XSSFCell) celliterator.next();
				switch(cell.getCellTypeEnum())
			    {
			    case STRING:System.out.print(cell.getStringCellValue());break;
			    case NUMERIC: System.out.print(cell.getNumericCellValue());break;
			    case BOOLEAN:System.out.print(cell.getBooleanCellValue());break;
			    }
				
			    System.out.print(" | ");
				
				
			}
			System.out.println(  );
				
			}*/
		}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		 
		 
		
	
	