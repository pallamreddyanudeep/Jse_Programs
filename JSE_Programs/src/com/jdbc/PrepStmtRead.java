package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PrepStmtRead {
	
	public static void main(String[] args) throws SQLException   {
		// TODO Auto-generated method stub
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system", "srujan");
			
			pstmt=con.prepareStatement("select * from company");
			pstmt.setFetchSize(2);
			boolean flag=pstmt.execute();
			
			if(flag== true) {
				
				 rs=pstmt.getResultSet();
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3));
				
			}
			
			}
				}
		catch (Exception e) {
			// TODO: handle exception
			con.rollback();
		}
		finally{
			pstmt.close();
			con.close();
			
		}

	}
}
