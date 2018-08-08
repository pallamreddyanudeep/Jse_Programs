package com.classandobject.interfaces;

public class MrthodsExample implements A,B {

@Override
public String m2() {
	return B.super.m2();
}
@Override
	public void m1() {
		A.super.m1();
	}

	
	
	public static void main(String[] args) {
MrthodsExample m= new MrthodsExample();
m.m1();
B.m1();
	}
}

interface A{
	default void m1() {
		System.out.println("In m1 metrhod of A");
	}
	static  int m2() {
		return 20;
		
	}
}

interface B{
	static void m1() {
		System.out.println("In m1 method of B");
	}
	
	default String m2() {
		return "srujan";
		
	}
}