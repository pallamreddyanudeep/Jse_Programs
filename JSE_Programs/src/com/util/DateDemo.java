package com.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateDemo {

	public static void main(String[] args) {
		Date d=new Date();
		System.out.println(d);
		SimpleDateFormat sfmt=new SimpleDateFormat("E, y-M-d 'at' h:m:s a z ");
		System.out.println("Format 1:   "+sfmt.format(d));
		sfmt = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
	      System.out.println("Format 2:   " + sfmt.format(d));
	      
	      sfmt = new SimpleDateFormat("EEEE, MM:d:yyyy");
	      System.out.println("Format 3:   " + sfmt.format(d));
	     //using formatter
	      // Use DateFormat
	      DateFormat formatter = DateFormat.getInstance(); // Date and time
	      String dateStr = formatter.format(d);
	      System.out.println("with get instance "+dateStr);
	      
	      //using gettimeinstance
	      formatter = DateFormat.getTimeInstance();        // time only
	      System.out.println("with getTimeInstance"+formatter.format(d));
	  
	      // Use locale
	      formatter = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, Locale.US);
	      System.out.println("with get date formatter"+formatter.format(d));
	      
	      
	      //using DateFormat of short
	      String dateShort = DateFormat.getDateInstance(DateFormat.SHORT).format(d);  
	       System.out.println("Formatting the Date using DateFormat.SHORT: "+dateShort);  
	       
	       String timeShort = DateFormat.getTimeInstance(DateFormat.SHORT).format(d);  
	       System.out.println("Formatting the Time using DateFormat.SHORT: "+timeShort);  
	      
	     //using DateFormat of medium
	       String dateMedium = DateFormat.getDateInstance(DateFormat.MEDIUM).format(d);  
	       System.out.println("Formatting the Date using DateFormat.MEDIUM: "+dateMedium); 
	      
	       String timeMedium = DateFormat.getTimeInstance(DateFormat.MEDIUM).format(d);  
	       System.out.println("Formatting the Time using DateFormat.MEDIUM: "+timeMedium); 
	       
	       //using DateFormat of long
	       String dateLong = DateFormat.getDateInstance(DateFormat.LONG).format(d);  
	       System.out.println("Formatting the Date using DateFormat.LONG: "+dateLong); 
	       
	       String timeLong = DateFormat.getTimeInstance(DateFormat.LONG).format(d);  
	       System.out.println("Formatting the Time using DateFormat.LONG: "+timeLong); 
	       
	       
	}

}
