package apachepoi;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceltodatabase {

	public static void main(String[] args) throws SQLException, IOException {
	
		//create connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/nit9pmoct2023","root","13579");
		
		Statement stmt=con.createStatement();
		//create table in the database
		
		String sql="create table thing (no int(2),course varchar(10),price int(5))";
		stmt.execute(sql);
		//excel
		FileInputStream fi=new FileInputStream(".\\apachefiles\\Booknames.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fi);
		XSSFSheet sheet=workbook.getSheet("sheet1");
		int rows=sheet.getLastRowNum();
		for(int r=1;r<=rows;r++)
		{
			XSSFRow row =sheet.getRow(r);
			double num=row.getCell(0).getNumericCellValue();
			String name=row.getCell(1).getStringCellValue();
			double sal=row.getCell(2).getNumericCellValue();
			
		 sql="insert into thing values('"+num+"','"+name+"','"+sal+"')";
			stmt.execute(sql);
			stmt.execute("commit");
			}
		
		
		workbook.close();
		fi.close();
		con.close();
		System.out.println("Done");
		
		
		
	}
	
}
