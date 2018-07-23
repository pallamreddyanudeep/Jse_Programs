package com.jdbc.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StatementRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con=null;
		Statement stmt=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			 con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/sonoo","root","srujan"); 
			 stmt=con.createStatement();  
			 stmt.setFetchSize(2);
			 ResultSet rs=stmt.executeQuery("select * from student");  
			 while(rs.next())  
			 System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
			
			 con.close();  
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

}
