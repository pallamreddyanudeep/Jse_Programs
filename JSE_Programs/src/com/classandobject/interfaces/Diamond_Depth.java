package com.classandobject.interfaces;

public class Diamond_Depth implements AB {

	public static void main(String[] args) {
		AB a=new Diamond_Depth();
		a.m1();

	}

	@Override
	public void m1() {
		
		System.out.println("hello in over ridden method");
	}



}

interface AB{
	default void m1(){
		System.out.println("hello in A");
	}
	static void m2() {
		System.out.println("hi in B");
	}
}

/*interface BA{
	default void m1(){
		System.out.println("hello in A");
	}
	static void m2() {
		System.out.println("hi in B");
	}
}*/