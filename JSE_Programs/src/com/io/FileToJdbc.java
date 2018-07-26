package com.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;



public class FileToJdbc {
	Connection con= null;
	java.sql.PreparedStatement ps=null;
	//static String s="";
	public static void main(String[] args) throws Exception {
		FileToJdbc f=new FileToJdbc();
		FileInputStream fis=new FileInputStream("F:\\demo.txt");
		BufferedInputStream bis=new BufferedInputStream(fis);
		int i;
		String s="";
		while((i=bis.read())!=-1) {
			char ch=(char)i;
		
			s=s.concat(Character.toString(ch));
		}

	System.out.println(s);
		f.toDb(s);
	}


	
	public void toDb(String s2) throws SQLException {
		
		try {
			String[] s1=s2.split(" ");
			int id=Integer.parseInt(s1[0]);
		
			int sal=Integer.parseInt(s1[2]);
			Class.forName("oracle.jdbc.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "srujan");
			ps=con.prepareStatement("insert into company values(?,?,?)");
			ps.setInt(1, id);
			ps.setString(2, s1[1]);
			ps.setInt(3,sal);
			int j=ps.executeUpdate();
			System.out.println(j+"rows updated");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			ps.close();
			con.close();
		}
	}
	
}
