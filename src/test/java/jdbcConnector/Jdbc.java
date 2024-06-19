package jdbcConnector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class Jdbc {
	@Test
	public void jdbc() throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","root");
		Statement stmt = con.createStatement();
		String s = "insert into student values(105,'singh',900),(106,'deshwal',1000)";
		stmt.execute(s);
		con.close();
		System.out.println("query is executed");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
