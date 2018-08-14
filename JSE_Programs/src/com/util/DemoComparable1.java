package com.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class DemoComparable1 {

	public DemoComparable1() {
	
	}

	public static void main(String[] args) {
		
		EmpOne e = new EmpOne(100,"sasi");
		EmpOne e1 = new EmpOne(20,"abc");
		EmpOne e2 = new EmpOne(10,"ram");
		EmpOne[] emps= {e,e1,e2};
		
		Arrays.sort(emps);
		for (EmpOne empOne : emps) {
			System.out.println(empOne.toString());
		}

		
		String[] names={"abc","xys","qqwe"};
		 Collections.sort(Arrays.asList(names), new SortByNames());
		 
		 for (String name : names) {
			 System.out.println(name);
			
		}
		
		 Collections.sort(Arrays.asList(emps), new SortByEmpName());
		 for (EmpOne emp : emps) {
			 System.out.println(emp.name);
			
		}
	}

	 

}
class EmpOne implements Comparable<EmpOne>{
	int id;
	String name;
	public EmpOne(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
/*  @Override
	public int compareTo(EmpOne o) {
		if(id==o.id){
			return 0;
		}else if(id<o.id){
			return 1;
		}
		return -1;
	}*/
	
	@Override
	public int compareTo(EmpOne o) {
		return o.name.compareTo(name);
	}	
	
	@Override
	public String toString() {
		return "EmpOne [id=" + id + ", name=" + name + "]";
	}
}

class SortByNames implements Comparator<String>{
	@Override
	public int compare(String o1, String o2) {
		return o2.compareTo(o1);
	}
}

class SortByEmpName implements Comparator<EmpOne>{

	@Override
	public int compare(EmpOne o1, EmpOne o2) {
		return o2.name.compareTo(o1.name);
	}
	 
}

