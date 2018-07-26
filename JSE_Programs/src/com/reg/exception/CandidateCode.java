package com.reg.exception;
import java.io.*;
import java.util.*;
import java.lang.*;
public class CandidateCode extends MyCalculator{
	
	public static void main(String args[] ) throws Exception{
    Scanner sc=new Scanner(System.in);
  int n,p;
   
    for(int i=0;i<4;i++){
     n=sc.nextInt();
     p=sc.nextInt();
   
    	try {
    		doCheck(n,p);
    	}
    	catch (ZeroException e) {
			System.out.println("java lang Exception:"+e.getMessage());
			
		}
    	catch (NegativeException ze) {
			System.out.println("java.lang.Exception:"+ze.getMessage());
		}
   
    }	//Write code here
}

    static void doCheck(int n,int p) throws NegativeException,ZeroException {
    	 CandidateCode m=new CandidateCode();
    
    	  
    	    	
    	    if(n<0|p<0){
    	        throw new  NegativeException("n or p should not be negative.");
    	    }
    	    else if(n==0&p==0){
    	        throw new ZeroException("n and p should not be zero." );
    	    }
    	    else
    	    {
    	    	 long r=m.power(n,p);
    	    	    System.out.println(r);
    	    }
    	    		
    	    	
    	   }
    }

   


class MyCalculator{
    
    public long power(int n,int p){
        long r;
        r=(long)Math.pow(n, p);
        return r;
    }
}

class NegativeException extends Exception{
    NegativeException(String msg){
        super(msg);
    }
}

class ZeroException extends Exception{
    ZeroException(String msg){
        super(msg);
    }
}