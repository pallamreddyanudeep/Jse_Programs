package com.relationbetweenobjects.inheritance;

import java.util.Scanner;

public class Area {
public static void main(String[] args) {
RectangleArea r=new RectangleArea(20,30);	
}
}

class SquareArea{
	double l;
	public SquareArea(double l) {
	
		this.l=l;
		this.squareArea(l);
		
	}
	public void squareArea(double l) {
		System.out.println("Area of square is :"+(l*l));
	}
}
class RectangleArea extends SquareArea{
	double l,b;
	Scanner sc=new Scanner(System.in);
	 public RectangleArea(double l,double b) {
		 super(l);
		this.l=l;
		this.b=b;
		rectangleArea(l,b);
		
	}
	public void rectangleArea(double l,double b) {
		System.out.println("Area of square is :"+(l*b));
	}
}