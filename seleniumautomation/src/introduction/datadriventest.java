package introduction;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class datadriventest {
	public static void main(String[] args) throws IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\shravani\\Documents\\data.xlsx");
	   XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet2");//providing sheet name
		
		//XSSFSheet sheet=workbook.getSheetAt(0);//providing sheet name
		int rowcount =sheet.getLastRowNum();
		int colcount=sheet.getRow(0).getLastCellNum();
		System.out.println(+rowcount);
		System.out.println(+colcount);
		for(int i=0;i<=rowcount;i++)
		{
			XSSFRow currentrow=sheet.getRow(i);    //current row
			
			for(int j=0;j<colcount;j++)
			{
				String value=currentrow.getCell(j).toString();     //read the values from a cell
				System.out.print("      "+value);
			}
			System.out.println();
		}
		
		

	}

}
