package com.util.collection.map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapsList {
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("how many students you wnat to enter");
	int	n=Integer.parseInt(br.readLine());
	Map<String, List> m=new HashMap<>();
	while(n>0) {
		System.out.println("Enter student name");
		String name=br.readLine();
		
		List<Integer> l=new ArrayList<>();
		l=add1();
		m.put(name, l);
		n--;
		}
		Set<String> s=m.keySet();
		for(String names:s) {
			System.out.println(names);
			System.out.println(m.get(names));
		}
	}

	public static List<Integer> add1() throws NumberFormatException, IOException{
		List<Integer> l=new ArrayList<>();
		System.out.println("Enter 6 subjects marks");
		int n=6;
		while(n>0) {
		l.add(Integer.parseInt(br.readLine()));
	n--;
		}
	/*	l.add(Integer.parseInt(br.readLine()));
		l.add(Integer.parseInt(br.readLine()));
		l.add(Integer.parseInt(br.readLine()));
		l.add(Integer.parseInt(br.readLine()));
		l.add(Integer.parseInt(br.readLine()));*/
		return l;
		
	}
}
