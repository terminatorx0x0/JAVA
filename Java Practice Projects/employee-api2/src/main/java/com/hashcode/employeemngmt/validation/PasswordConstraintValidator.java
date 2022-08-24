package com.hashcode.employeemngmt.validation;

import java.util.Arrays;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordConstraintValidator implements ConstraintValidator<IsValidEmpName, String>{

	@SuppressWarnings("unlikely-arg-type")
	@Override
	public boolean isValid(String empname, ConstraintValidatorContext context) {
	    List<String> list=Arrays.asList(new String[] {"Prince","vivek","Nikhil"});
		return list.contains(empname);
	} 

}
