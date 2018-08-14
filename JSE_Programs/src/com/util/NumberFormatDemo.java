package com.util;

import java.text.NumberFormat;
import java.util.Locale;
public class NumberFormatDemo {

	public static void main(String[] args) {
		
		NumberFormat nf= NumberFormat.getCurrencyInstance(Locale.TAIWAN);
		float f=010.25f;
		int i=6553123;
		System.out.println(nf.format(f));
		NumberFormat nf1=NumberFormat.getNumberInstance();
		nf1.setMaximumFractionDigits(1);
		nf1.setMinimumIntegerDigits(2);
		System.out.println(nf1.format(f));
		nf1=NumberFormat.getIntegerInstance();
	
	}

}
