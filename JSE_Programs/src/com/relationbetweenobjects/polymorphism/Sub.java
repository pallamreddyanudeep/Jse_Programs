package com.relationbetweenobjects.polymorphism;

public class Sub extends Sup{

	public void m2() {
		System.out.println("bye");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sup p=new Sub();
		Sub b=(Sub) p;
		
		Sub b1=new Sub();
		Sup b2=(Sup) b1;
	
		
	}

}

class Sup{
	public void m1() {
		System.out.println("hello");
	}
}