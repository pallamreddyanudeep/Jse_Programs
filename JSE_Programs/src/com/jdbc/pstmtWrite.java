package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class pstmtWrite {
	static int i;
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection con=null;
		PreparedStatement pstmt=null;
		boolean flag=true;
		
		try {
		
			Class.forName("oracle.jdbc.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "srujan");
		
			pstmt=con.prepareStatement("Insert into student values(?,?,?)");
			while(flag) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the id ");
			int id=sc.nextInt();
			pstmt.setInt(1,id);
			System.out.println("Enter the name ");
			String name=sc.next();
			pstmt.setString(2,name);
			System.out.println("Enter the marks ");
			int marks=sc.nextInt();
			pstmt.setInt(3, marks);
			i=pstmt.executeUpdate();
			System.out.println("you want to continue enter 1");
			int check=sc.nextInt();
			if(check!=1)
			flag=false;
			}
			System.out.println(i+"rows updated");
		}catch (Exception e) {
			// TODO: handle exception
		}finally {
			con.close();
		}
		
	}

}
