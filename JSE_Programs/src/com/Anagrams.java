package com;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			boolean status;
			System.out.println("enter first string");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			String s1=(br.readLine());
			s1=s1.replaceAll("\\s", "");
			System.out.println("enter second string");
			String s2=(br.readLine());
			s2=s2.replaceAll("\\s", "");
			if(s1.length()!=s2.length()) {
				status=false;
			}
			else {
			char[] ch1=s1.toLowerCase().toCharArray();
			Arrays.sort(ch1);
			for(char i:ch1)
			System.out.print(i);
			System.out.println();
			char[] ch2=s2.toLowerCase().toCharArray();
			Arrays.sort(ch2);
			for(char j:ch2)
				System.out.print(j);
			System.out.println();
			status=Arrays.equals(ch1, ch2);
			}
		if(status==true) {
			System.out.println(s1+" and "+s2+" areanagrams ");
		}
		else
			System.out.println(s1+" and "+s2+" are not anagrams");
	}
}
