package com.relationbetweenobjects.polymorphism;

public class DynamicOverRiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*	bank b=new bank();
		b.rateOfIntrest(5.02);
		b=new Icici();
		b.rateOfIntrest(6.02);*/
Sbi	b1=new Sbi();
		b1.rateOfIntrest(4.02);
		//b.show();
	}

}

class bank{
	public void rateOfIntrest(double x) {
		System.out.println("the rate of intrest in bank is "+x);
	}
	
}
class Icici extends bank{
	public void rateOfIntrest(double x) {
	super.rateOfIntrest(x);
		System.out.println("the rate of intrest in icici is "+x);
	}
}
class Sbi extends bank{
	@Override
	public void rateOfIntrest(double x) {
		// TODO Auto-generated method stub
		super.rateOfIntrest(x);
		System.out.println("the rate of intrest in sbi is "+x);
	}
	public void show() {
		
	}
}