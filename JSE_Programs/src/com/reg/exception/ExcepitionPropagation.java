package com.reg.exception;

public class ExcepitionPropagation {

	public static void main(String[] args)  {
		
		 try {
			
			doAuth();
			
		} catch (AgeNotAvailableException ae) {
			
			ae.printStackTrace();
			
		}
	}
	
	static void doAuth() throws AgeNotAvailableException {
		try {
		
			doValidate(12);
		}
		catch (EligibilityAgeException a) {
			throw new AgeNotAvailableException(a.getMessage());
		}
	}
	
	
	static void doValidate(int age) throws EligibilityAgeException {
		if(age<18) {
		
			throw new EligibilityAgeException("Not Eligible for voting");
		}else
			System.out.println("eleigible for voting");
	}

}


class EligibilityAgeException extends RuntimeException{
	

	public EligibilityAgeException(String msg) {
		super(msg);
	}
}

class AgeNotAvailableException extends Exception{

	public AgeNotAvailableException(String msg) {
	super(msg);
	}
}