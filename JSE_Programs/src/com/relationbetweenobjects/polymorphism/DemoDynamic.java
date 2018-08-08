package com.relationbetweenobjects.polymorphism;

public class DemoDynamic extends Demo {

	@Override
	public void dispaly(int x) {
	
		super.dispaly(x);
		System.out.println((Math.sqrt(x)));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoDynamic d=new DemoDynamic();
		d.dispaly(20);
	}

}

class Demo{
	public void dispaly(int x) {
		System.out.println(x*x);
	}
}

class Demo2 extends Demo{

}