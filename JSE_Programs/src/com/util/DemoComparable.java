package com.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class DemoComparable {

	public static void main(String[] args) {
		
		Emp e=new Emp(12, "Srujan");
		Emp e1=new Emp(11, "abhi");
		Emp e2=new Emp(13, "mahi");
		
		Emp[] emps= {e,e1,e2};
/*		Arrays.sort(emps);
for (Emp emp : emps) {
	System.out.println(emp.toString());
}*/

	Collections.sort(Arrays.asList(emps), new SortByName());
	
	for (Emp emp : emps) {
		System.out.println(emp.name);
	}
	}

}

class Emp implements Comparable<Emp>{
	int id;
	String name;
	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
/*@Override
	public int compareTo(Emp o) {
		if(id==o.id) {
			return 0;
		}
		else if(id<o.id) {
			
			return 1;
		}
		return -1;
	}*/

@Override
public int compareTo(Emp o) {
return o.name.compareTo(name);
}
	
	
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}
}


class SortByName implements Comparator<Emp>{

	@Override
	public int compare(Emp o1, Emp o2) {
	
		return o1.name.compareTo(o2.name);
	}
}
