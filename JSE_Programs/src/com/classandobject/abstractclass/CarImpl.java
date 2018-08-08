package com.classandobject.abstractclass;

public class CarImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Benze("Benze", 1212);
	 c.wheels();
		c.gears();
		Benze b=new Benze("Benze02", 0007);
		b.wheels();
		b.Display();
		b.gears();
		 c=new Maruthi("Maruthi", 393);
		 c.gears();
		 Maruthi m=new Maruthi("Maruthi", 002);
		 m.Display();
		 m.gears();
		 m.wheels();
	}

}


abstract class Car{
	String name;
	int 	regNo;
	Car(String name,int id){
		this.name=name;
		regNo=id;
	}
	 public abstract void gears();
	public void wheels() {
		System.out.println("there are four wheels");
	}
	 
}

class Benze extends Car{

	Benze(String name, int id) {
		super(name, id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void gears() {
		// TODO Auto-generated method stub
		System.out.println("gear automatic in benze");
	}
	 public void Display() {
		 System.out.println(name);
		 System.out.println(regNo);
	 }
}


class Maruthi extends Benze{

	Maruthi(String name, int id) {
		super(name, id);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void gears() {
		// TODO Auto-generated method stub
		System.out.println("gear are manual in Maruthi");
	}
}