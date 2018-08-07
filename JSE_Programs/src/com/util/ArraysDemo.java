package com.util;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
	int[] a= {1,2,3,8,7,4,5,6,9};
	int copy[];
	Arrays.sort(a);
	for(int i:a)
	System.out.println(i);
	System.out.println(Arrays.binarySearch(a, 5));
	copy=Arrays.copyOf(a, a.length);
	for(int i:copy)
		System.out.println(i);
	int copy2[]=Arrays.copyOfRange(a, 2, 7);
	for(int i:copy2)
		System.out.println(i);
		Arrays.fill(a, 10);
		for(int i:a)
			System.out.println(i);
		int a1[]= {6,5,8,2,3,1};
		Arrays.sort(a1, 1, 5);
		for(int i:a1)
			System.out.println(i);
	}

}
