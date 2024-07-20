package apachepoi;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writeintocell {

	public static void main(String[] args) throws IOException  {
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook .createSheet("numbers");
		XSSFRow row=sheet.createRow(0);
		row.createCell(0).setCellValue(10);
		row.createCell(1).setCellValue(20);
		row.createCell(2).setCellValue(30);
		row.createCell(3).setCellFormula("A1*B1*C1");
		//String filepath="C:\\Users\\shravani\\Documents\\calc.xlsx";
		//FileOutputStream fo=new FileOutputStream(filepath);
		FileOutputStream fo=new FileOutputStream(".//apachefiles//cal.xlsx");
		workbook.write(fo);
		//fo.close();
		System.out.println("calc file write successfully");
		
		
		

	}

}
