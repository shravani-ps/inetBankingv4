package apachepoi;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExceltoHashmap {

	public static void main(String[] args) throws IOException {
	FileInputStream fi=new FileInputStream(".\\apachefiles\\students.xlsx");
	XSSFWorkbook workbook=new XSSFWorkbook(fi);
	XSSFSheet sheet=workbook.getSheet("Student info");
	
	int rows=sheet.getLastRowNum();
	System.out.println(rows);
	//read data from excel to hashmap
	
	HashMap<String,String> data=new HashMap<String, String>();
	
	for(int r=0;r<=rows;r++)
	{
		String key=sheet.getRow(r).getCell(0).getStringCellValue();
		String value=sheet.getRow(r).getCell(1).getStringCellValue();
		data.put(key, value);
	}
	
	//read data from hashmap
	
	for(Map.Entry entry:data.entrySet())
	{
		System.out.println(entry.getKey()+"  "+entry.getValue());
	}
	
	

	}

}
