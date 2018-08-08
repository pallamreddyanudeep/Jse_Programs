package com.util.collection.jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;



public class DemoObject extends Student {
static	DemoObject dm=new DemoObject();
static	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
static	Jdbc_Connection jd;
static Student s;
static String s1;	
	
	public static void main(String[] args) throws Exception {
		int i=0;
		
		System.out.println("enter some thingh");
		s1=br.readLine();
		//s=(Student)Class.forName("Student").newInstance();
		s=new Student();
		
		try {
			
		jd=new Jdbc_Connection();
		jd.connect();
		
		dm.set_data();
		
				
	ArrayList<Student> al= new ArrayList<Student>();
	al.add(s);
	System.out.println(s.getMarks());
	jd.ps= jd.con.prepareStatement("Insert Into Student Values(?,?,?)");
	Iterator<Student>ir= al.iterator();
	while(ir.hasNext()) {
		Student st=(Student)ir.next();
		jd.ps.setInt(1, st.getRollNo());
		jd.ps.setString(2, st.getName());
		jd.ps.setInt(3, st.getMarks());
		 i=jd.ps.executeUpdate();
		
	}
	System.out.println("done"+i+"rows update");
	}catch (Exception e) {
	e.printStackTrace();
	}
		
	finally {
		jd.con.close();
	}
	}
	
	public void set_data() throws Exception  {
		System.out.println("enter ID");
		s.setRollNo(Integer.parseInt(br.readLine()));
		System.out.println("enter name");
		s.setName(br.readLine());
		System.out.println("enter marks");
		s.setMarks(Integer.parseInt(br.readLine()));
	}

}
