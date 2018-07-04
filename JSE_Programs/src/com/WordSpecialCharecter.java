package com;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WordSpecialCharecter {
	static int count=0,i=0;
	public static void main(String[] args) throws IOException {
		
		System.out.println("enter first string");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s1=(br.readLine());
		char[] c=s1.toCharArray();
		System.out.println("enter a charecter");
		String t=br.readLine();
	//	int n=compare(c,t);	
		String[] n=s1.split(t);
		int s=n.length;
		System.out.println(t +" is repeated "+ s +" times");
	}
	
	public static int compare(char []ch,char ch2) {
	
	if(ch[i]==ch2)
		count++;
	if(i<ch.length-1) {	
	     i++;
	     compare(ch,ch2);
	}
	
	return count;
}
	
}
	