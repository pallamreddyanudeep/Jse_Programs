package com.classandobject.abstractclass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CompanyImpl extends EmpDetails {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
public CompanyImpl( String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter a company name");
String name =br.readLine();
	CompanyImpl c=new CompanyImpl(name);
	c.empDetails();
	System.out.println("enter a company name");
 name =br.readLine();
	CompanyImpl c1=new CompanyImpl(name);
	c1.empDetails();
	c.display();
	c1.display();
}
}


abstract class Employee{
	String name;
	public Employee(String name) {
		// TODO Auto-generated constructor stub
		
		this .name=name;
		
	}
	abstract void empDetails() throws NumberFormatException, IOException;
	public void company() {
		System.out.println("Company name "+name);
	}
}

class EmpDetails extends Employee{
	private String name;
	private int empid;
	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final int getEmpid() {
		return empid;
	}

	public final void setEmpid(int empid) {
		this.empid = empid;
	}

	Adderss add;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public EmpDetails( String name) {
		super( name);
		// TODO Auto-generated constructor stub
	}

	@Override
	void empDetails() throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		System.out.println();
		super.company();
		System.out.println("add Employee name");
		setName(br.readLine());
		System.out.println("add Employee Id");
		setEmpid(Integer.parseInt(br.readLine()));
		add=new Adderss();
		add.addAddress();
		
	}
	
	
	public void display() {
		System.out.println("Employee name :"+name);
		//System.out.println("Employee Id is :"+empId);
		System.out.println("Employee address is ");
		System.out.println("EMployee Hno: "+add.gethNo());
		System.out.println("EMployee Street Name: "+add.getStreetName());
		System.out.println("EMployee colony: "+add.getColony());
		System.out.println("EMployee state: "+add.getState());
		System.out.println("EMployee state: "+add.getPinCode());
		System.out.println();
	}
	
}

class Adderss{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	private int hNo;
	private String streetName;
	private String colony;
	private String State;
	private int pinCode;
	public synchronized final int gethNo() {
		return hNo;
	}
	public  void sethNo(int hNo) {
		this.hNo = hNo;
	}
	public  String getStreetName() {
		return streetName;
	}
	public  void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public  String getColony() {
		return colony;
	}
	public  void setColony(String colony) {
		this.colony = colony;
	}
	public  String getState() {
		return State;
	}
	public  void setState(String state) {
		State = state;
	}
	public  int getPinCode() {
		return pinCode;
	}
	public  void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	
	public void addAddress() throws NumberFormatException, IOException{
		System.out.println("Enter Employee H No : ");
		sethNo(Integer.parseInt(br.readLine()));  					//entering Hno
		System.out.println("Enter Employee Streetname : ");
		setStreetName(br.readLine());								//entering streetNme	
		System.out.println("Enter Employee colony : ");
		setColony(br.readLine());								//entering colony name
		System.out.println("Enter Employee State : ");
		setState(br.readLine());						
		System.out.println("Enter Employee pincode : ");
		setPinCode(Integer.parseInt(br.readLine()));
	}
}