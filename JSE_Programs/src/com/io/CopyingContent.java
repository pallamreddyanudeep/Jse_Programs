package com.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyingContent {
	static String s="";
	public static void main(String[] args) throws IOException {
	FileInputStream fis=new FileInputStream("F:\\txt\\something.txt");
	BufferedInputStream bis=new BufferedInputStream(fis);
	int i;

	while((i=bis.read())!=-1) {
		char ch=(char)i;
	
		s=s.concat(Character.toString(ch));
	}

	System.out.println(s);
	
	String s2[]=s.split(" ");
	System.out.println(" the number of words are "+ s2.length);
	
	FileOutputStream fos=new FileOutputStream("copy.txt");
	BufferedOutputStream bos= new BufferedOutputStream(fos);
	byte []b=s.getBytes();		
	bos.write(b);
	bis.close();
	fis.close();
	bos.close();
	fos.close();
	
	}

}
