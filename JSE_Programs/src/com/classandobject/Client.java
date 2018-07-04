package com.classandobject;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		Student s2=new Student();
		s2.name="srujan";
		s2.id=001;
		Student s3=new Student();
		s1.display();
		s2.display();
		s3.display();
	}

}

class Student{
	int id;
	String name;
	public void display() {
		System.out.println("Student id is: "+id);
		System.out.println("Student name is : "+name);
	}
}