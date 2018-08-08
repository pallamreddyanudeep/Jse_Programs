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
	int i,count=0;
StringBuffer s1=new StringBuffer();
	while((i=bis.read())!=-1) {
		char ch=(char)i;
	if(!(Character.isLetterOrDigit(ch))) {
		count=count+1;
	}
	
			//s1=s1.append(ch);
		s=s.concat(String.valueOf(ch));
	}
	
	//s=s1.toString();
	System.out.println(s);
	System.out.println("number of special charecter are"+count);
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
