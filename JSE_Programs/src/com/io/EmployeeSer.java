package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.jdbc.PreparedStatement;

public class EmployeeSer implements Serializable{

	int empid;
	String ename;
	int sal;
	Connection con=null;
	java.sql.PreparedStatement  ps=null;
	public EmployeeSer() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Id");
		this.empid = sc.nextInt();
		System.out.println("Enter the name");
		this.ename = sc.next();
		System.out.println("Enter the salary");
		this.sal = sc.nextInt();
	}

	public static void main(String[] args) throws IOException, SQLException {
		
		EmployeeSer e=new EmployeeSer();
		FileOutputStream fos=new FileOutputStream("abc.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(e);
		System.out.println("done with Serilization");
		
		e.deser();
		oos.close();
		fos.close();
	}
	
	public void deser() throws FileNotFoundException, IOException, SQLException {
		try
		{
			
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("abc.txt"));
		EmployeeSer de=(EmployeeSer)ois.readObject();

		Class.forName("oracle.jdbc.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "srujan");
		
		ps=con.prepareStatement("insert into company values(?,?,?)");
		ps.setInt(1,de.empid );
		ps.setString(2, de.ename);
		ps.setInt(3,de.sal);
		int j=ps.executeUpdate();
		System.out.println(j+"rows updated");
		ois.close();
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
