package com.luv2code.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidation implements ConstraintValidator<CourseCode, String> {

	private String coursePrefix;
	
	public void initialize(CourseCode theCourseCode) {
		coursePrefix = theCourseCode.value();
	}
	
	public boolean isValid(String theCode, ConstraintValidatorContext context) {
		
		if (theCode.startsWith(coursePrefix))
			return true;
		
		return false;
	}

}
