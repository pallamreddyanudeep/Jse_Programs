package com.relationbetweenobjects.inheritance;

import java.util.Scanner;

public class SampleExample {
String name;
int age;

public String getName() {
	return name;
}
public void setName(String name) {
	 this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	 this.age = age;
}

}

class Sample2 extends SampleExample{
private String sid;
private int marks;
static final String school;
Sample2(String sid,int marks){
	this.sid=sid;
	this.marks=marks;
	
	this.data();
	this.display();
	
}
static {
	school="paramitha";
}
public void data() {
	System.out.println("Enter name :");
	Scanner sc=new Scanner(System.in);
	setName(sc.next());
	System.out.println("Enter age :");
	setAge(sc.nextInt());
	sc.close();
	
}
public void display() {
	System.out.println("Name is : "+getName());
	System.out.println("age  is : "+getAge());
	System.out.println("School is : "+school);
	System.out.println("Sudent id is : "+sid);
	System.out.println("Marks is : "+marks);
}

}
class samp{
	public static void main(String[] args) {
		Sample2 s=new Sample2("12B81a04f0", 750);
		Sample2 s2=new Sample2("12B81", 45);
	}
}

	
