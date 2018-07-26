package com.reg.exception;

public class UserExceptionsImpl {
	public static void main(String[] args) throws EmpDetailException {
		Emp e=new Emp("Srujan",10);
		Dovalidate(e);
	}
	
	static void Dovalidate(Emp e) throws EmpDetailException {
		if(e.empId!=12) {
			throw new EmpDetailException("Not an EMployee");
		}
		
	}
}

class Emp{
	int empId;
	String name;
	Emp(String name,int empId){
		this.empId=empId;
		this.name=name;
	}
	
}

class EmpDetailException extends Exception{
	public EmpDetailException() {
		
	}
	
	  public EmpDetailException(String msg) {
	
		super(msg);
	}
}