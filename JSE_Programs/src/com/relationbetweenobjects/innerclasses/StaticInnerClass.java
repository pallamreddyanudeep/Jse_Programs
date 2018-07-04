package com.relationbetweenobjects.innerclasses;

public class StaticInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Outer.Inner o=new Outer.Inner();
      o.msg();
      Outer.Inner.msg2();//
	}
	
}

class Outer{
   static int x=10;
   static class Inner{
	   int y=10;
	   void msg(){System.out.println("data is "+y);}  
	   static void msg2(){System.out.println("data is "+x);}  
     
   }
}