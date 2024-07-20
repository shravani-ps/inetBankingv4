package apachepoi;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class HashmapExcel {

	public static void main(String[] args) throws IOException {
	 
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook .createSheet("Student info");
		
		
		Map<String, String> data=new HashMap<String, String>();
		data.put("101", "sam");
		data.put("102", "manu");
		data.put("103", "paddu");
		data.put("104", "yamu");
		data.put("105", "chinna");
		
		int rowno=0;
		
		for(Map.Entry entry:data.entrySet())
			{
			XSSFRow row=sheet.createRow(rowno++); 
			row.createCell(0).setCellValue((String)entry.getKey());
			row.createCell(1).setCellValue((String)entry.getValue());
			}
		FileOutputStream output=new FileOutputStream(".\\apachefiles\\students.xlsx");
		workbook.write(output);
		workbook.close();
		output.close();
		System.out.println("excel write successfully");
	}
}
