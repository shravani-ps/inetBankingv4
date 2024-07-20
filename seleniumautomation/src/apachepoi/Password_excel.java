package apachepoi;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Password_excel {

	public static void main(String[] args) throws  IOException, EncryptedDocumentException, InvalidFormatException{
	
		FileInputStream file=new FileInputStream(".\\apachefiles\\calculate.xlsx");
		String password="test123";
		XSSFWorkbook workbook=(XSSFWorkbook) WorkbookFactory.create(file,password);
		XSSFSheet sheet=workbook.getSheetAt(0);
		int rows=sheet.getLastRowNum();
		System.out.println(rows);
		int cols=sheet.getRow(0).getLastCellNum();
		System.out.println(cols);
		for(int r=0;r<=rows;r++)
		{
			XSSFRow row=sheet.getRow(r);
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
		workbook.close();
		file.close();
		}
		
		
		
	}


