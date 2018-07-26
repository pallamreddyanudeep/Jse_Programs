package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;


public class Scroll_Isensitive {
	
	public static void main(String[] args) throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "srujan");
			ps=con.prepareStatement("select * from company", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			ResultSet rs=ps.executeQuery();
			rs.afterLast();
			while(rs.previous()) {
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(1));
			
			}
			rs.absolute(3);
			int i=rs.getRow();
			System.out.println(i);
		}catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			ps.close();
			con.close();
		}
	}
	

}
