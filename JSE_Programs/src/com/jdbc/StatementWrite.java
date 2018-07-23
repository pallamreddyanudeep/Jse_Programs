package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementWrite {
	static Connection con=null;
	static Statement stmt=null;
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "srujan");
		stmt =con.createStatement();
		
		stmt.executeQuery("select * from student");
		
		
		stmt.close();
		con.close();
		
	}

}
