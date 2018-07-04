package com.relationbetweenobjects.innerclasses;

public class InstanceInnerClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A.B b=new A().new B();
	//b.display();
	}
	
}

class A{
 int x=20; 
 static int y=10;
	public  A(){
		 
		B c=new B();
	  c.display();
	
 }class B{
		int y=10;
		public void display(){
			y=20;
			System.out.println("Inner class Dispaly x = "+x+" y = "+y);
		}
		 }
	

}