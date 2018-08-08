package com.util;

import java.util.Calendar;
import java.util.Date;

public class CalenderMethods {
	   public static void main(String[] args) {  
		   Calendar calendar = Calendar.getInstance();  
		   System.out.println("The current date is : " + calendar.getTime());  
		   calendar.add(Calendar.DATE, -15);  
		   System.out.println("15 days ago: " + calendar.getTime());  
		   calendar.add(Calendar.MONTH, 5);  
		   System.out.println("5 months later: " + calendar.getTime());  
		   calendar.add(Calendar.YEAR, 3);  
		   System.out.println("3 years later: " + calendar.getTime());  
		   int maximum = calendar.getMaximum(Calendar.DAY_OF_WEEK);  
		   System.out.println("Maximum number of days in week: " + maximum);  
		   maximum = calendar.getMaximum(Calendar.WEEK_OF_YEAR);  
		   System.out.println("Maximum number of weeks in year: " + maximum); 
		 int   minimum = calendar.getMinimum(Calendar.DAY_OF_WEEK);  
		   System.out.println("Minimum number of days in week: " + minimum);  
		   minimum = calendar.getMinimum(Calendar.WEEK_OF_YEAR);  
		   System.out.println("Minimum number of weeks in year: " + minimum); 
	   } 
}
