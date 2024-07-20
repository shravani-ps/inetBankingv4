package apachepoi;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Formatecolor {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("sheet1");
		XSSFRow row=sheet.createRow(1);
		//setting background colour
		XSSFCellStyle style =workbook.createCellStyle();
		style.setFillBackgroundColor(IndexedColors.BRIGHT_GREEN.getIndex());
		style.setFillPattern(FillPatternType.BIG_SPOTS);
		
		XSSFCell cell=row.createCell(1);
		cell.setCellValue("welcome");
		cell.setCellStyle(style);
		
		
		//setting foreground color
		style=workbook.createCellStyle();
		style.setFillForegroundColor(IndexedColors.DARK_RED.getIndex());
		style.setFillPattern(FillPatternType.DIAMONDS);
		 
		cell=row.createCell(2);
		cell.setCellValue("Automation");
		cell.setCellStyle(style);
		
		FileOutputStream output=new FileOutputStream(".\\apachefiles\\styles.xlsx");
		workbook.write(output);
		workbook.close();
		output.close();
	
	System.out.println("Done!!");
	}
	

}

