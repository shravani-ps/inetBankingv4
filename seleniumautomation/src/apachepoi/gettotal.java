package apachepoi;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class gettotal {

	public static void main(String[] args) throws IOException {
		String path=".//apachefiles//Booknames.xlsx";
		FileInputStream input=new FileInputStream(path);
		XSSFWorkbook workbook=new XSSFWorkbook(input);
		XSSFSheet sheet=workbook.getSheetAt(0);
		sheet.getRow(4).getCell(2).setCellFormula("sum(c2:c4)");
		input.close();
		FileOutputStream fo=new FileOutputStream(path);
		workbook.write(fo);
		workbook.close();
		fo.close();
		
		
		
	}

}
