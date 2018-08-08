package com.util.collection.map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Duplicate {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Map<Character,Integer> m=new HashMap<Character, Integer>();
		System.out.println("enter the string");
		String s=br.readLine();
		//s=s.replace(" ", "");	
		s=s.toUpperCase();
		int count;
		char ch[]=s.toCharArray();
		Character c1;
		for(int i=65;i<=90;i++) {
			c1=(char)i;
			count=0;			
			for(int j=0;j<ch.length;j++) {
				if(c1.equals(ch[j])){
				count++;			
			}
		
			}
			m.put(c1, count);
		}
		
		//Set<Character> keySet = m.keySet();
		  //Set<Entry<Character, Integer>> entrySet = m.entrySet();
		Iterator<Map.Entry<Character, Integer>> it=m.entrySet().iterator();
		while(it.hasNext()) {
			Entry<Character, Integer> next = it.next();
			System.out.println(next.getKey()+" "+next.getValue());
		}
	}
		
}
