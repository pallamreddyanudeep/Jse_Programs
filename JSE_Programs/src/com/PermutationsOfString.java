package com;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PermutationsOfString {

	    
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("enter the string :");
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String s1=br.readLine();
		int n=s1.length();
		//char[] ch=new char[s1.length()];
		permute(s1,0,n-1);
	}
	public static void permute(String s,int f,int l) {
		if(f==l) {
			//System.out.println();
			System.out.println(s);
			//System.out.println();
		}
		else {
			for(int i=f;i<=l;i++) {
			s=swap(s,f,i);
			permute(s,(f+1),l);
			s=swap(s,f,i);
			}
		} 
			
	}
	
	public static String swap(String s2,int i,int j) {	
		char temp;
		
		char ch[]=
		s2.toCharArray();
		
		temp=ch[i];
		ch[i]=ch[j];
		ch[j]=temp;
		return String.valueOf(ch);
	}

}
