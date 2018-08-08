package com.wrapper;

public class IntegerWrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=05;
		String h="20230";
		Integer c=new Integer(a);
		System.out.println(c+a);
		Integer e=Integer.valueOf(b);
		System.out.println(e+c);
		Integer i=Integer.valueOf(h);
		int z=i.intValue();
		System.out.println(z);
		int d=c.intValue();
		System.out.println(d);
		
		String f=Integer.toString(a);
		String m=e.toString();
		Integer g=Integer.valueOf(f);
		int x=g.intValue();
		System.out.println(m+60);
		System.out.println(f+20);
		System.out.println(x+10);
		System.out.println(i+10);
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toOctalString(a));
		System.out.println(Integer.toHexString(a));
		System.out.println(Integer.compare(a, b));
		System.out.println(c.compareTo(e));
	}

}
