package com.util.collection.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class DemoLinkedList {

	public static void main(String[] args) {
		Shirt s=new Shirt(38,"casual",700.00f);
		Shirt s1=new Shirt(40,"Tshirt",800.00f);
		Shirt s2=new Shirt(42,"formal",650.00f);

		LinkedList<Shirt> l=new LinkedList<>();
		l.add(s);
		l.add(s1);
		l.add(s2);
		
		System.out.println(l.isEmpty());
		ListIterator<Shirt> li= l.listIterator();
	/*	while(li.hasNext()) {
			Shirt sh=(Shirt)li.next();
			System.out.println(sh.size+" "+sh.type+" "+sh.price);
		}
		while(li.hasPrevious()) {
			Shirt sh=(Shirt)li.previous();
			System.out.println(sh.size+" "+sh.type+" "+sh.price);
		}*/
	
	
		LinkedList<Integer> l1=new LinkedList<>();
		l1.add(10);
		l1.add(12);
		l1.add(14);
		System.out.println(l1.pop());
		l1.remove(1);
	
		
		l1.addFirst(9);
		l1.add(9);
		l1.addLast(15);
		System.out.println(Collections.binarySearch(l1, 15));
		
		ListIterator<Integer> li1=l1.listIterator();
		while(li1.hasNext()) {
			System.out.println(li1.next());
		}
		
		l1.removeLast();
		l1.removeFirst();
		l1.pollFirst();
		l1.removeFirstOccurrence(9);
		ListIterator<Integer> li2=l1.listIterator();
		
		
		while(li2.hasNext()) {
			System.out.println(li2.next());
		}
	
}

}


class Shirt{
	int size;
	String type;
	float price;
	public Shirt(int size, String type,float price) {
		this.size = size;
		this.type = type;
		this.price=price;
	}	
}

