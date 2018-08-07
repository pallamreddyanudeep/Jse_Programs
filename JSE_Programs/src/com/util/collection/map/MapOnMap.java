package com.util.collection.map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MapOnMap {
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	static Map<String, Map> m1=new HashMap<>();
static 	Map<String,Integer> m2=new HashMap<>();
	public static void main(String[] args) throws NumberFormatException, IOException {
	
		System.out.println("How many Student");
		int n=Integer.parseInt(br.readLine());
		while(n>0) {
			System.out.println("Enter Student name");
			String name =br.readLine();
			System.out.println("enter the number of subjects");
			int n1=Integer.parseInt(br.readLine());
			while(n1>0) {
				sub(name,m2);
				
				n1--;
				System.out.println(m2.values());
			}
			m1.put(name, m2);	
			n--;
		}
		
	System.out.println(m1.size());
	System.out.println(m2.size());
		Iterator<Map.Entry<String, Map>> it=m1.entrySet().iterator();
		while(it.hasNext()) {
			Entry<String, Map> next = it.next();
			System.out.println(next.getKey());
			System.out.println(next.getValue());
		}

	}
	
	public static void sub(String name, Map<String, Integer> m2) throws IOException {
		
		System.out.println("enter Subject name");
		String names1=br.readLine();
		System.out.println("marks of that subject");
		int m=Integer.parseInt(br.readLine());
		m2.put(names1, m);
		
	}


	
	
	

}
