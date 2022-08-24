package com.hashcode.employeemngmt;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
	public static void main(String[] args) throws ParseException {
	    String sDate6 = "2020-08-05 11:50:55.555";
	    System.out.println(covertDate(sDate6)); //2020-08-05T11:50:55.555
	  }

	   public static LocalDateTime covertDate(String date) throws ParseException {
	         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS", Locale.ENGLISH);
	         LocalDateTime dateTime = LocalDateTime.parse(date,formatter);
	         return dateTime;  
	    }

}
