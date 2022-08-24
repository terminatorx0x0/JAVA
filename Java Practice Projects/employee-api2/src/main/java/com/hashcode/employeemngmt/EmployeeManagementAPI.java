package com.hashcode.employeemngmt;

import java.text.ParseException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeManagementAPI {
	
	public static void main (String[] args) throws ParseException {
		SpringApplication.run(EmployeeManagementAPI.class, args);
		
	}

}
