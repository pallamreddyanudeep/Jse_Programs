package com.util;

import java.util.Locale;
import java.util.ResourceBundle;

public class DemoResourceBundle {

	public static void main(String[] args) {
	System.out.println("current Locale "+Locale.getDefault());
	ResourceBundle rb=ResourceBundle.getBundle("resources.MyLabel");
	System.out.println("How_are_you in english "+rb.getString("How_are_You"));
	
	Locale.setDefault(new Locale("hn","MY"));
	System.out.println("current Locale "+Locale.getDefault());
	rb=ResourceBundle.getBundle("resources.MyLabel");
	System.out.println("How_are_you in english "+rb.getString("how_are_you"));
	}

}
