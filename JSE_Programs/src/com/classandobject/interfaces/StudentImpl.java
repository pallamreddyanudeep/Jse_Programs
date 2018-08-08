package com.classandobject.interfaces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentImpl {

	public static void main(String[] args) throws IOException {
		
		StudentMarks m=new StudentMarks();
		m.details();
		//m.mark();	
		
		StudentMarks m1=new StudentMarks();
		m1.details();
		m1.mark();
		m1.dispaly();
		m.dispaly();
	}

}


interface studentInt{
	String schoolName="paramitha";
	public void details() throws IOException;
	public int marks() throws NumberFormatException, IOException ;
	
}

abstract class StudentDetails implements studentInt{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	private String stdName;
	private int stdid;
	Adderss add;
	
	public String getStdName() {
		return stdName;
	}


	public void setStdName(String stdName) {
		this.stdName = stdName;
	}


	public int getStdid() {
		return stdid;
	}


	public void setStdid(int stdid) {
		this.stdid = stdid;
	}


	@Override
	public void details() throws IOException {
	System.out.println("enter the StudentID");
	setStdid(Integer.parseInt(br.readLine()));
	System.out.println("enter the Student Name");
	setStdName(br.readLine());
	add=new Adderss();
	add.addAddress();
	}
	
}

class Adderss{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	private int hNo;
	private String streetName;
	private String colony;
	private String State;
	private int pinCode;
	public int gethNo() {
		return hNo;
	}
	public void sethNo(int hNo) {
		this.hNo = hNo;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getColony() {
		return colony;
	}
	public void setColony(String colony) {
		this.colony = colony;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public void addAddress() throws NumberFormatException, IOException{
		System.out.println("Enter Student H No : ");
		sethNo(Integer.parseInt(br.readLine()));  					//entering Hno
		System.out.println("Enter Student Streetname : ");
		setStreetName(br.readLine());								//entering streetNme	
		System.out.println("Enter student colony : ");
		setColony(br.readLine());								//entering colony name
		System.out.println("Enter student  State : ");
		setState(br.readLine());						
		System.out.println("Enter student pincode : ");
		setPinCode(Integer.parseInt(br.readLine()));
	}
}


class StudentMarks extends StudentDetails{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int marks;

	@Override
	public int marks() throws NumberFormatException, IOException {
		int tot ;
		System.out.println("enter total marks");
		tot=Integer.parseInt(br.readLine());
		return tot;
	}

	public void mark() throws NumberFormatException, IOException {
		marks=marks();
	}
	public void dispaly()  {
		System.out.println("Student School name is : "+schoolName);
		System.out.println("Student  id is : "+getStdid());
		System.out.println("Student  name is : "+getStdName());
		System.out.println("Student  address is");
		System.out.println("-------------------------------------------");
		System.out.println("Student  Hno is : "+add.gethNo());
		System.out.println("Student  Street is : "+add.getStreetName());
		System.out.println("Student  colony is : "+add.getColony());
		System.out.println("Student state is : "+add.getState());
		System.out.println("Student  Street is : "+add.getPinCode());
		System.out.println("Student  marks is : "+marks);
	}
}