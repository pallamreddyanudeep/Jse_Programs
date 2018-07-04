package com.relationbetweenobjects.inheritance;

public class CallingBaseConstructor {
	public static void main(String[] args) {
		
	
Child c=new Child();
}
}

class Base{
	int x,y,z;
	Base(int x){
		this(20,30);
		this.x=x;
	}
	Base(int x,int y){
		this.y=x;
		this.z=y;
	}
	public void display(){
		System.out.println("base values x ="+x+" \ty="+y+"\tz= "+z );
	}
}

class Child extends Base{
    int a,b;
	Child() {
		
		this(40,50);
		
	}
	Child(int x,int y) {
		super(100);
		this.a=x;
		this.b=y;
		this.dispaly();
	}
	
	public void dispaly() {
		System.out.println(" in child class : a"+a+"\t b="+b);
		super.display();
	}
}