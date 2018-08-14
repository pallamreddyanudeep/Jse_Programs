package com.classandobject.abstractclass;

public class DemoAbstact extends Three{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		First d=new Three();
		d.dispaly();
		d.show();
		DemoAbstact dm=new DemoAbstact();
		dm.notDone();
		dm.dispaly();
		dm.show();
	}
}


											//Staring of abstract class
abstract class First{
	
	abstract  public void show();
	abstract  public  void dispaly();
}


											//First abstact extended to second
 abstract class Second extends First{
	@Override
	public void show() {
		// TODO Auto-generated method stub
	System.out.println("in show mehod");	
	}
}
 
 
class Three extends Second{					//second abstact extended to three

	@Override
	public void dispaly() {
		// TODO Auto-generated method stub
		System.out.println("indispaly method");
	}
	
	public void notDone(){
		System.out.println("not abstact method in third");
	}
}