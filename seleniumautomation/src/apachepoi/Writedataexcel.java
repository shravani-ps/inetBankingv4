package apachepoi;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writedataexcel {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("emp info");
		
		/*Object empdata[][]= {  {"empno","empname","salary"},
				{101,"abc",15000},
				{102,"xyz",20000},
				{103,"pqr",25000}
		};*/
		
		
		
		ArrayList<Object[]> empdata=new ArrayList<Object[]>();
		empdata.add(new Object[]  {"empno","empname","salary"});
		empdata.add(new Object[] {101,"abc",15000});
		empdata.add(new Object[] {102,"xyz",20000});
		empdata.add(new Object[] {103,"pqr",25000});
		/*int rows= empdata.length;
		int cols=empdata[0].length;
		System.out.println(+rows);
		System.out.println(+cols);	
		
		//using for loop
		
		for(int r=0;r<rows;r++)
		{
			XSSFRow row=sheet.createRow(r);  
			for(int c=0;c<cols;c++)
			{
				XSSFCell cell=row.createCell(c);
				Object value=empdata[r][c];
				if(value instanceof String)
					cell.setCellValue((String)value);
				if(value instanceof Integer)
					cell.setCellValue((Integer)value);
				if(value instanceof Boolean)
					cell.setCellValue((Boolean)value);
			}
			
			}*/
		//   using foreach loop
		int rowcount =0;
		for(Object emp[]:empdata)
		{
			XSSFRow row=sheet.createRow(rowcount++);
			int colcount=0;
			for(Object value:emp)
			{
			XSSFCell cell=row.createCell(colcount++);
			if(value instanceof String)
				cell.setCellValue((String)value);
			if(value instanceof Integer)
				cell.setCellValue((Integer)value);
			if(value instanceof Boolean)
				cell.setCellValue((Boolean)value);
		}
		}

		String filepath="C:\\Users\\shravani\\Documents\\employee.xlsx";
		FileOutputStream fo=new FileOutputStream(filepath);
		workbook.write(fo);
		fo.close();
		System.out.println("write data successfully");
		
		
		
		
		
		
	
		
		
		
	}
	}





