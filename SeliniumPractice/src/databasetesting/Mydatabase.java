package databasetesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class Mydatabase {

	public static void main(String[] args) throws SQLException, InterruptedException {
		//connecting to the database
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","13579");
if(con.isClosed())
{
	System.out.println("database not connected");
}else
{
	System.out.println("database connected");
}
	//running the database
	Statement sss=con.createStatement();
      // ResultSet rs= stmt.executeQuery("select * from student where id=10;");
    // String query="select id,name,marks from student;";
  String value="insert into student values(40,'sachin',98)";
  Thread.sleep(2000);
  sss.executeUpdate(value);
  			/*while(rs.next())
     {
    	 System.out.println(rs.getInt("id"));
    	 System.out.println(rs.getString("name"));
    	 System.out.println(rs.getInt("marks"));
    			/*int id=rs.getInt("id");  
    			 String name=rs.getString("name");
    			 int marks=rs.getInt("marks");*/
   					con.close();
   		 System.out.println("program executed");
	}
}
//create connection
//create statement
//execute statement
//close connection
