package jdbcConnector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class JdbcSelectQuery {
	
	@Test
	public void selectquery() throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","root");
		Statement stmt = con.createStatement();
		String s= "select * from student";
		
		ResultSet rs = stmt.executeQuery(s);
		while(rs.next()) {
		int sno = rs.getInt("Sno");
		String sname = rs.getString("Sname");
		int marks = rs.getInt("Marks");
		System.out.println(sno+" "+sname+" "+marks);
		
		}
		con.close();
		System.out.println("query executed");
		
		
	}
	
	
	
	
	
	
	

}
