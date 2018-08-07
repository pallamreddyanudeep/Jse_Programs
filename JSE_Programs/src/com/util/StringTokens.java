package com.util;

import java.util.StringTokenizer;

public class StringTokens {

	public static void main(String[] args) {
	
String s="Hello ,Everyone whatsapp";
StringTokenizer st=new StringTokenizer(s);



while(st.hasMoreElements()){
	String token = (String)st.nextElement(); 
	System.out.println(token);
	
}
StringTokenizer st1=new StringTokenizer(s," ");

while(st1.hasMoreTokens()) {
	System.out.println(st1.nextToken(","));
	
}
	}

}
