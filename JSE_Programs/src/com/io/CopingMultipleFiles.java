package com.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopingMultipleFiles {
	static String s="";
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("F:\\txt");
		if(f.isDirectory()) {
		String []mfiles=f.list();
		int i;
		for(String paths:mfiles) {
			FileInputStream fis=new FileInputStream("F:\\txt\\"+paths);
			while((i=fis.read())!=-1) {
				char ch=(char)i;
				//System.out.print(ch);
				s=s.concat(Character.toString(ch));
				
			}
			s=s.concat("\n");
			
fis.close();
		}
		System.out.println(s);
	FileOutputStream fos=new FileOutputStream("Multiple.txt",true);
	byte[] b=s.getBytes();
	fos.write(b);
	fos.close();
System.out.println("done");
		}

	}

}
