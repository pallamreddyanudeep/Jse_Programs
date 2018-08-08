package com.reg.exception;

public class MultiCatch {

	public static void main(String[] args) {
		int x=10;
		String s="Srujan";
		int []a= {1,2,3};
		try {
			System.out.println(s.charAt(12));
			System.out.println(a[3]);
			System.out.println(x/0);
		} catch (ArithmeticException|ArrayIndexOutOfBoundsException|StringIndexOutOfBoundsException e) {
			e.printStackTrace();
			
		}
	}

}
