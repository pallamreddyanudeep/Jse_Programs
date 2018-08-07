package com.util.collection.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class StudentArrayList {

	public static void main(String[] args) {
		
		Student s=new Student(1,"srujan",90);
		Student s1=new Student(2,"spandan",99);
		ArrayList<Student> al=new ArrayList<>();
		al.add(s1);
		al.add(s);
		Iterator it=al.iterator();
		while(it.hasNext()) {
			Student st=(Student)it.next();
			System.out.println(st.id+" "+st.name+" "+st.marks);
		}
		List<Integer> al1=new ArrayList();
		Integer[] x= {10,12};
		int names[]= {10,12};
		 al1=Arrays.asList(x);
		Iterator it1=al1.iterator();
		while(it1.hasNext()) {
			
				System.out.println( it1.next());
		}
		
	}

}


class Student{
	int id;
	String name;
	int marks;
	public Student(int id, String name, int marks) {
	
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	

}