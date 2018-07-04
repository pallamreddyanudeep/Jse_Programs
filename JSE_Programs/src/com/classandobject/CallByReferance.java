package com.classandobject;

public class CallByReferance {

	String s1;
	
 
	public static void method(CallByReferance c1,CallByReferance c2) {
		String temp=null;
		temp=c1.s1;
		c1.s1=c2.s1;
		c2.s1=temp;
	}
	public static void main(String[] args) {
	

		CallByReferance cf=new CallByReferance();
		CallByReferance cf2=new CallByReferance();
		 cf.s1="srujan";
	    cf2. s1="spandan";
	    System.out.println(cf.s1 +" \t"+ cf2.s1);
	   method(cf,cf2);
	   System.out.println(cf.s1 +" \t"+ cf2.s1);
	}

}
