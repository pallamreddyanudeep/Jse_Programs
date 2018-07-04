package com;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SpecialCharecterCheck1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int count,flag=0;
		System.out.println("Enter the string  :");
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		String str=br.readLine();
		char ch[]= {'!','@','#','$','%','^','&','*','(',')','_','+',',','{','}','?'};

		char[] c=str.toCharArray();
		for(int i=0;i<c.length;i++)
		System.out.println(c[i]);
	
		for(int i=0;i<c.length;i++) {
			count=0;
			for(int j=0;j<ch.length;j++) {
				if(c[i]==ch[j]) {
					count++;
				}
				
			}if(count>0) {
				System.out.println(ch[i]+" special charrecter is repeated : "+count+" times");
				flag=1;
			
			}
		}if(flag==0)
		System.out.println("no Special Charecters are there in string");
		
		br.close();
	}

}
