package com.util.collection.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

import oracle.jdbc.driver.OracleBlobInputStream;

public class Jdbc_Connection {
	Connection con= null;
	java.sql.PreparedStatement ps= null;
public void connect() throws Exception {
	
	
	try {
	Class.forName("oracle.jdbc.OracleDriver");
	con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "srujan");
	System.out.println("COnnection Extablished");
	
	}
	catch (Exception e) {
		e.getMessage();
	}

}



}
