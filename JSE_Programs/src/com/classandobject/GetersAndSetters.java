package com.classandobject;

public class GetersAndSetters {
	  String name;
	 static int id;
	
	


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		GetersAndSetters.id = id;
	}

	public void dispaly() {
		System.out.println(getName());
		System.out.println(getId());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	GetersAndSetters dt=new GetersAndSetters();
			dt.setName("hari");
			dt.setId(12);
			dt.dispaly();
			GetersAndSetters dt1=new GetersAndSetters();
			dt1.setName("Srujan");
			dt1.setId(13);
			dt1.dispaly();
			dt.dispaly();
		
	}

}
