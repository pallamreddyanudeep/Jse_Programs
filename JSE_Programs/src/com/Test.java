package com;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Test {
	public static void main(String[] args) throws IOException {
		System.out.println("Enter the string  :");
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		String str=br.readLine();
		String []s=str.split(" ");
		Test t=new Test();
		t.sort(s,0);
		
	}

	public void sort(String[] s,int fir) {
		int last=s.length-1;
		if(fir==last) {
			for(int i=0;i<last;i++) {
				System.out.println(s[i]);
			}
		}
		else {
			
		  s=compare(s[fir],s[fir+1]);
		  sort(s,(fir+1));
		}
	}
	
	public String[] compare(String s1,String s2) {
		String []str=new String[s1.length()];
		char fi[]=new char[s1.length()];
		char se[]=new char[s2.length()];
		if(s1.length()<s2.length()) {
		str=swap(s1,s2);
		}
		else {
		for(int i=0;i<s1.length();i++) {
		if(fi[i]<se[i]) {
		str=swap(s1,s2);
			break;
		}
		}
		}
		return str;
	}
	
	public static String[] swap(String s2,String s4) {	
		
		
		String ch[]=new String[2];
		
	
		ch[0]=s4;
		ch[1]=s2;
		return ch;
	}
}