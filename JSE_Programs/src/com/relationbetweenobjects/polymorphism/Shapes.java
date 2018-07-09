package com.relationbetweenobjects.polymorphism;

import java.util.Scanner;

import javax.lang.model.util.Elements;

public class Shapes {

	public static void main(String[] args) {
		Shape s=new Shape();
			s.shape();
			s=new Triangle();
			s.shape();
			s.area();
			s=new Rectangle();
			s.shape();
			s.area();
			
	}

}

class Shape{
	
	public void shape() {
		System.out.println(" blank shape");
	}
	public void area() {
		System.out.println("empty Area");
	}
}

class Triangle extends Shape{
	Scanner sc=new Scanner(System.in);
	double b,h;
	public Triangle() {
		this.elements();

		}
public void elements(){
	System.out.println("ENter the height of triangle");
	h=sc.nextDouble();
	System.out.println("ENter the breadth of triangle");
	b=sc.nextDouble();
}
	public void shape() {
		System.out.println("triangle");
	
	}
 public void display() {
	 System.out.println("display method of Triangle ");
 }
 public void area() {
		System.out.println((b*h)/2+"triangle Area :");
	}
}

class Rectangle extends Shape{
	Scanner sc=new Scanner(System.in);
	double b,l;
	public Rectangle() {
		this.elements();
	}
	public void elements(){
		System.out.println("ENter the length of triangle");
		l=sc.nextDouble();
		System.out.println("ENter the breadth of triangle");
		b=sc.nextDouble();
	}
	public void shape() {
		System.out.println("the Rectangle");
	}
	public void dispaly() {
		System.out.println("Display method of Rectangle");
	}
	 public void area() {
			System.out.println((b*l)+"triangle Area :");
		}
}