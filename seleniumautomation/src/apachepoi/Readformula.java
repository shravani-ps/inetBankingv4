package apachepoi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.SpreadsheetVersion;
import org.apache.poi.ss.formula.udf.UDFFinder;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Name;
import org.apache.poi.ss.usermodel.PictureData;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.SheetVisibility;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;

public class Readformula {

	public static void main(String[] args) throws IOException {
		FileInputStream fi=new FileInputStream("C:\\Users\\shravani\\Documents\\addition.xlsx");
		XSSFWorkbook workbook=new  XSSFWorkbook(fi); 
		XSSFSheet sheet=workbook.getSheet("sheet1");
		int rows=sheet.getLastRowNum();
		int cells=sheet.getRow(0).getLastCellNum();
		System.out.println(rows);
		System.out.println(cells);
		for(int r=0;r<=rows;r++)
		{
			XSSFRow row=sheet.getRow(r);
			for(int c=0;c<cells;c++)
			{
			XSSFCell cell=row.getCell(c);
			switch(cell.getCellTypeEnum())
			   {
			    case STRING:System.out.print(cell.getStringCellValue());break;
			    case NUMERIC: System.out.print(cell.getNumericCellValue());break;
			    case BOOLEAN:System.out.print(cell.getBooleanCellValue());break;
			    case FORMULA:System.out.println(cell.getNumericCellValue());break;
			   }
			}
			
			System.out.println();
			
		}
			
			
	}}


