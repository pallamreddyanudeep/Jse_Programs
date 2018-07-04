package com.classandobject;

import java.util.Scanner;

public class ConstructorPassing {
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d1=new Demo();
		//d1.dispaly();
	}

}

class Demo{
 private 	int num[];
 private 	int sum=0;
	Scanner sc=new Scanner(System.in);
	public Demo(){
		this(5);
		System.out.println("this is done by constructor calling");
	}
	
	
	public Demo(int a) {		
		num=new int[a];
		System.out.println("ENter the "+a+ " values to the array");
		for(int i=0;i<a;i++) {
		num[i]=sc.nextInt();
		sum+=num[i];
		dispaly();
	 	}
	}
	
	public   void dispaly() {
		System.out.println("Entered array" );
		for(int i=0;i<5;i++) {
			System.out.println(num[i]);
		}
		System.out.println("the sum of the array is :"+sum );	
	}

}

class Display extends Demo{
	
}