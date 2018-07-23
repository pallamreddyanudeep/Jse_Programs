package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchExample {
	Connection con=null;
	Statement stmt=null;
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		BatchExample b= new BatchExample();
		b.connect();
		b.Add();
		b.con.close();
	}
	
	public void Add() throws SQLException {
	try {
		stmt =con.createStatement();
		 String SQL = "INSERT INTO student " + 
                 "VALUES(003,'GHI',50)";
		stmt.addBatch(SQL);
		
		 SQL= "UPDATE student " + 
                 "SET SMARKS=60 WHERE SID=003";
                
	            
		stmt.addBatch(SQL);
		
	int []a=stmt.executeBatch();
	System.out.println("In batch");
		
		for(int i:a)
		System.out.println(i);
		
	}catch (Exception e) {
		// TODO: handle exception
		
		e.getMessage();
	}
	
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

