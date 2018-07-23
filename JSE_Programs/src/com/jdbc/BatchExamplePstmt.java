package com.jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class BatchExamplePstmt {
	Connection con=null;
	PreparedStatement ps=null;
	public static void main(String[] args) throws SQLException, NumberFormatException, IOException {
		// TODO Auto-generated method stub
BatchExamplePstmt bep=new BatchExamplePstmt();
bep.connect();
bep.Add();
	}
	
	public void Add() throws SQLException, NumberFormatException, IOException {
		int i;
		String Sql="Insert into workers(wid,wname,wsal)"+"values(?,?,?)";
		ps=con.prepareStatement(Sql);
		for(i=0;i<2;i++) {
		
			System.out.println("ENter workers id ");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int	wid=Integer.parseInt(br.readLine());
			System.out.println("ENter workers name ");
			String wname=br.readLine();
			System.out.println("ENter workers id ");
			int	wsal=Integer.parseInt(br.readLine());
			
			ps.setInt(1, wid);
			ps.setString(2, wname);
			ps.setInt(3, wsal);
			
			ps.addBatch();
			
		}
		int a[]=ps.executeBatch();
		for(int j:a) {
			System.out.println(j);
		}
		con.commit();
		con.close();
	}

	public void connect() {
		try {
		Class.forName("oracle.jdbc.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "srujan");
		con.setAutoCommit(false);
		}catch (Exception e) {
		e.getMessage();// TODO: handle exception
	}
	}
}
