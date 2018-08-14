package com.util.collection.lists;

import java.util.Enumeration;
import java.util.Vector;
import java.util.*;
public class Vectorist {

	public static void main(String[] args) {
			
		Vector<String> v=new Vector<>();
		
		v.addElement("srujan");
		v.add("sai");
		v.insertElementAt("saikumar", 1);
		v.add("vikram");
		v.add("ran");
		v.set(2, "dhoni");
		Enumeration<String> e = v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		System.out.println(v.lastElement());
		System.out.println(v.firstElement());
		System.out.println(v.capacity());
		System.out.println(v.contains("dhoni"));
	
		List<Integer> l=new Vector();
		Integer a[]= {10,12};
		l=Arrays.asList(a);
		Iterator< Integer> it=l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();
		
	}

}
