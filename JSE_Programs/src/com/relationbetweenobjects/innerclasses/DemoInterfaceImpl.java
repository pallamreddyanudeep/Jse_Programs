package com.relationbetweenobjects.innerclasses;

public class DemoInterfaceImpl extends Outer1 {

	public static void main(String[] args) {
		
		Outer1.inner i=new Outer1.inner() {
			
			@Override
			public void m1() {
			
				System.out.println("hello");
			}
		};
	i.m1();
	}
}

class Outer1{
	interface inner{
		void m1();
	}
}
