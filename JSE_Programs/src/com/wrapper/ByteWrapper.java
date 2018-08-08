package com.wrapper;

public class ByteWrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b=23;
		Byte b1=new Byte(b);
		Byte b2=new Byte("125");
		byte b4=b1.byteValue();
		short a=b2.shortValue();
		int c=10;
		System.out.println(b+" "+(b1+c)+" "+b2+" "+(b4+b));
		
		String s=b2.toString();
		System.out.println(s+10);
		byte b3=Byte.valueOf(b);
		
		System.out.println(b3+10);
	}

}
