package com.wrapper;

public class CharWrap {

	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Character ch1=new Character('&');
		Character ch='a';
		char ch2='A';
		System.out.println(ch.charValue());
	
		char []a= {'a','b','c'};
		String s=Character.toString(ch);
		String s2=String.valueOf(a);
		
		System.out.println(s+" "+s2);
		System.out.println(Character.isLetterOrDigit(ch)+" "+ch1.isLetterOrDigit(ch1));
		System.out.println(ch.toUpperCase(ch));
		System.out.println(ch1.equals(ch));
		System.out.println(Character.compare(ch, ch2));
		System.out.println(Character.toLowerCase(ch2));
	}

}
