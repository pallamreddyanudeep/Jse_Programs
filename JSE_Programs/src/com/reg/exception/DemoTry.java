package com.reg.exception;

import java.io.IOException;

public class DemoTry {

	public static void main(String[] args) throws IOException,ArithmeticException{
		String name=null;
try {
	//System.out.println(name.toString());
	int x=20;
	//System.out.println(x/0);
	int[] a= {10,20,30};
	System.out.println(a[3]);
} 
catch (NullPointerException ne) {
	
	System.out.println(ne.getMessage());
}
catch (ArithmeticException ae) {
	System.out.println(ae.getMessage());
}
catch (ArrayIndexOutOfBoundsException abe) {
	abe.printStackTrace();
	System.out.println(abe.getMessage());
}
catch (Exception e) {
	// TODO: handle exception
}
finally {
	// TODO: handle finally clause
}
	}

}


