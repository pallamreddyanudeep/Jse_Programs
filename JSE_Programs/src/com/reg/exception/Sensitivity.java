package com.reg.exception;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Sensitivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con=null;
		Statement stmt=null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "srujan");
			con.setAutoCommit(false);
			stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE ,ResultSet.TYPE_SCROLL_INSENSITIVE);
			ResultSet rs=stmt.executeQuery("select * from student");
			rs.absolute(3);
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3));
			
			}catch (Exception e) {
			e.getMessage();// TODO: handle exception
	}
	}
}
