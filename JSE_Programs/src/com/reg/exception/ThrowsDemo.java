package com.reg.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThrowsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
try {
	String s=br.readLine();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

}
