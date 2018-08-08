package com.util.collection.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class DemoArrayList {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Srujan");
		al.add("sai");
		al.add("vikram");
		al.add(2, "roshan");
		al.set(1, "saikumar");
		Iterator it= al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		it.remove();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println(al.get(2));
		System.out.println(al.isEmpty());
		System.out.println(al.remove(2));
		al.clear();
		System.out.println(al.isEmpty());
		ArrayList<String> al2=new ArrayList<String>();
		al2.add("someone");
		al2.add("noone");
		al.addAll(al2);
		ListIterator<String> li= al.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
	
		
	}
	
}
