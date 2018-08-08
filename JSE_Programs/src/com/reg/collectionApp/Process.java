package com.reg.collectionApp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;



public class Process extends Employee{
	static	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	static	List<Employee> l=new LinkedList<>();
	static Employee e;
	static Process p=new Process();
	public void add() throws Exception {
		
		e=new Employee();
		p.set_data();
		l.add(e);
	}
	
	
	public void set_data() throws Exception  {
		System.out.println("enter ID");
		e.setId(Integer.parseInt(br.readLine()));
		System.out.println("enter name");
		e.setName(br.readLine());
		System.out.println("enter Rating");
		e.setRating(Integer.parseInt(br.readLine()));
	
	}

	public void Display() {
		Iterator<Employee> it= l.iterator();
		while(it.hasNext()) {
			Employee ep=(Employee)it.next();
			System.out.println(" Employee  Id 		"+ep.getId());
			System.out.println(" Employee  Name 	"+ep.getName());
			System.out.println(" Employee  Rating   "+ep.getRating());
		}
	}
	
	public void modify() throws Exception {
		System.out.println("enter the index you want to modify");
		int n=Integer.parseInt(br.readLine());
		System.out.println("now enter the new details");
		p.set_data();
		l.set(n, e);
		
	}
	public void remove() throws NumberFormatException, IOException {
		System.out.println("enter the index you want to remove");
		int n=Integer.parseInt(br.readLine());
		l.remove(n);
	}
	
}
