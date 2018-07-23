package com.relationbetweenobjects;

import java.util.Scanner;

public class ReferanceExample {
	public static void main(String[] args) {
		
Three t3=new Three(5);	
Two tw=new Two(t3);
One o=new One(tw);
o.display();

	}
}

class One{
	Two t;
	int x;
	One(Two t){
	this.t=t;
	x=10;
	}
	public void display() {
		System.out.println(x);
		t.display();
		System.out.println(t.y);
	}
	
}
class Two{
	
	int y;
	Three t3;
	Two(Three t3){
		this.t3=t3;
		
		
	}
public void display() {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number to square ");
	y=sc.nextInt();
	System.out.println(y*y);
	t3.display();
	sc.close();
}
}

class Three{
	int z;
Three(int x){
	z=x;
}
public void display() {
	System.out.println(z*z*z);
}
}


