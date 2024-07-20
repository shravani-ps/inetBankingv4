package apachepoi;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Databasetoexcel {

	public static void main(String[] args ) throws SQLException, IOException {
		//connect to the database
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/nit9pmoct2023","root","13579");
		
		//statement or query
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from employee");
		 //create excel
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("employee");
		XSSFRow row=sheet.createRow(0);
		row.createCell(0).setCellValue("Empid");
		row.createCell(1).setCellValue("name");
		row.createCell(2).setCellValue("salary");
		row.createCell(3).setCellValue("designation");
		//row.createCell(4).setCellValue("location");
		//row.createCell(5).setCellValue("doj");
		//row.createCell(5).setCellValue("department");
		int r=1;
	    while(rs.next())
	    {
	    	int id=rs.getInt("Empid");
	    	String name=rs.getString("name");
	    	Long sal=rs.getLong("salary");
	    	String des=rs.getString("designation");
	    	//String loc=rs.getString("location");
	    // doj=rs.getDate("doj");
	    	//int dep=rs.getInt("dapartment");
	    	row=sheet.createRow(r++);

	    	row.createCell(0).setCellValue(id);
	    	row.createCell(1).setCellValue(name);
	    	row.createCell(2).setCellValue(sal);
	    	row.createCell(3).setCellValue(des);
	    	//row.createCell(4).setCellValue("loc");
	    	//row.createCell(5).setCellValue("dep");
	    	
	    	
	    	
	    }
	    FileOutputStream fo=new FileOutputStream(".\\apachefiles\\database.xlsx");
	    workbook.write(fo);
	    workbook.close();
	    fo.close();
	    con.close();
	    System.out.println("done");
	}
}
