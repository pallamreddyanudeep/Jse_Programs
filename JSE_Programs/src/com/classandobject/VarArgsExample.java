package com.classandobject;

import java.util.Scanner;

public class VarArgsExample {
	int sum=0;
	public VarArgsExample(String... s) {
		for(String k:s) {
			System.out.println(k);
		}
		// TODO Auto-generated constructor stub
	
	}
	public void sum(int... x) {
		for(int i:x)
			sum+=i;   
		System.out.println("the sum of array is : "+sum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VarArgsExample vr=new VarArgsExample("srujan","spandan","sandeep");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter the elements :");
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		vr.sum(a);
		sc.close();
	}

}
