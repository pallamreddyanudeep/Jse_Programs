package com.jdbc;

import java.sql.*;


public class Scroll_senstive {

	public static void main(String[] args) throws SQLException {
		Connection con=null;
		Statement ps=null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "srujan");
		    ps=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet rs=ps.executeQuery("select * company");
			System.out.println("hello");
			rs.moveToInsertRow();
			rs.updateInt(1, 1);
			rs.updateString(2,"srujan");
			rs.updateInt(3, 25000);
			rs.insertRow();
			rs.absolute(3);
			rs.deleteRow();
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		finally{
			ps.close();
			con.close();
		}
		
	}

}
