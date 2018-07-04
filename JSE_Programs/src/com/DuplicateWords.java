package com;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DuplicateWords {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
System.out.println("Enter the String");
int count;
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		String[] words=s.split(" ");
	
		
		for(int i=0;i<words.length;i++) {
			count=0;
		
			for(int j=i+1;j<words.length;j++) {
				if(words[i]!=null) {
					if(words[i].equalsIgnoreCase(words[j])) {
						count++;
						words[j]=null;
					}
				}
			}
			
			
			if(words[i]!=null) {
				System.out.println(words[i]+" is repeated "+count+" times");
			}
		}
	}

}
