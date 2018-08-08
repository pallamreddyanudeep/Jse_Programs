package com.reg.collectionApp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Check extends Process {
	static	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	static Check c=new Check();
	int y;
	public static void main(String[] args) throws Exception {	
		c.work();	
	}
	public void work() throws Exception {
		System.out.println("enter 1 to Add Details of Employee");
		System.out.println("enter 2 to display ");
		System.out.println("enter 3 to modify employee details");
		System.out.println("enter 4 to remove details");
		System.out.println("enter the choice");
		
		int ck=Integer.parseInt(br.readLine());
		switch(ck){
		case 1:c.add();
				System.out.println(" enter 1 wish to continue");
				y=Integer.parseInt(br.readLine());
				if(y==1) {
					c.work();
				}
				break;
		case 2:	c.Display();
				System.out.println(" enter 1 wish to continue");
				y=Integer.parseInt(br.readLine());
				if(y==1) {
					c.work();
				}
				break;
		case 3: c.modify();
				System.out.println(" enter 1 wish to continue");
				y=Integer.parseInt(br.readLine());
				if(y==1) {
					c.work();
				}
				break;
		case 4:c.remove();	
				System.out.println(" enter 1 wish to continue");
				y=Integer.parseInt(br.readLine());
				if(y==1) {
					c.work();
				}
				break;
		}
	}

}
