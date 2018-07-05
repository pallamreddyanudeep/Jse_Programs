package com.relationbetweenobjects.inheritance;
import java.io.*;
public class Banking extends UserDetails{

public static void main(String[] args) throws IOException {
	

	UserDetails u=new UserDetails();
	u.enterDetails();
	u.showDetails();
	u.withDraw();
	//u.checkBalence();
	UserDetails u1=new UserDetails();
	u1.enterDetails();
	u1.showDetails();
	u1.showDetails();
	u1.withDraw();
	u1.checkBalence();
	u.checkBalence();
}
}

class Details{
	private String name;
	private long accountNumber;
	private double balence;
	public synchronized final String getName() {
		return name;
	}
	public synchronized final void setName(String name) {
		this.name = name;
	}
	public synchronized final long getAccountNumber() {
		return accountNumber;
	}
	public synchronized final void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public synchronized  double getBalence() {
		return balence;
	}
	public synchronized  void setBalence(double balence) {
		this.balence = balence;
	}
	
		
}

class UserDetails extends Details{		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public void enterDetails() throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Genrate user name");
		super.setName(br.readLine());
		System.out.println("Genrate user Account Number");
		super.setAccountNumber(Long.parseLong(br.readLine()));
		System.out.println("enter user Balence");
		super.setBalence(Double.parseDouble(br.readLine()));		
}
	
	 void checkBalence() {
		 
		System.out.println(getBalence());
	}
	  
	 public void withDraw() throws NumberFormatException, IOException {
		 System.out.println("Enter the amount to withDraw");
		 double bal=getBalence();
		 System.out.println(bal);
		 int amount=Integer.parseInt(br.readLine());
		 if(amount<=bal) {
			 bal=bal-amount;
			 setBalence(bal);
		 }
		 else {
			 System.out.println("Insufficiant funds");
		 }
	 }
	public void showDetails() {
		System.out.println("user name :"+super.getName());
		System.out.println("Genrate user Account Number "+super.getAccountNumber());
		System.out.println("enter user Balence "+super.getBalence());
	}
}
	
class Bank extends UserDetails {

}