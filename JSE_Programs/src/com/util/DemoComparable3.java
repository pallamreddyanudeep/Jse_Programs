package com.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class DemoComparable3 {

	public static void main(String[] args) {
	Std s1=new Std(100, "abc");
	Std s2=new Std(90, "xyz");
	Std s3=new Std(125, "monc");
Std[] st= {s1,s2,s3};
/*Arrays.sort(st);
for (Std std : st) {
	System.out.println(std);
}*/

	Collections.sort(Arrays.asList(st), new SortByNs());
	for (Std std : st) {
		System.out.println(std);
	}
	}

}

class Std implements Comparable<Std>{
int id ;
String name;
public Std(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
/*@Override
public int compareTo(Std o) {
	
	return o.name.compareTo(name);
}*/
@Override
public String toString() {
	return "Std [id=" + id + ", name=" + name + "]";
}
@Override
public int compareTo(Std o) {
	if(id==o.id)
		return 0;
	else if(id>o.id)
		return 1;
	else			
	return -1;
}

}


class SortByNs implements Comparator<Std>{

	@Override
	public int compare(Std o1, Std o2) {
		
		return o1.name.compareTo(o2.name);
	}

}
