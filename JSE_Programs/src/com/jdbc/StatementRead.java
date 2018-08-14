package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StatementRead {
 Connection con=null;
 Statement stmt=null;
ResultSet rs=null;
 public static void main(String[] args) {
		// TODO Auto-generated method stub
	 try
	 {
		 Class.forName("oracle.jdbc.driver.OracleDriver");  
		  
		//step2 create  the connection object  
		Connection con=DriverManager.getConnection(  
		"jdbc:oracle:thin:@localhost:1521:xe","system","srujan");  
		  
		//step3 create the statement object  
		Statement stmt=con.createStatement();  
		
		//step4 execute query  
		ResultSet rs=stmt.executeQuery("select * from company"); 
		
		while(rs.next()) {  
			stmt.setFetchSize(2);
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3));  
		}
		//stmt.executeQuery("Insert into company values(5,'sriram',25000)");
		//step5 close the connection object  
		stmt.close();
		con.close();  
		  
		}catch(Exception e){ System.out.println(e);}  
		  
		}  
	
	

}
