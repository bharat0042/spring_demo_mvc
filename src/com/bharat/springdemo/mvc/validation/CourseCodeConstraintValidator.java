package com.bharat.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {
	
	private String coursePrefix;

	@Override
	public void initialize(CourseCode courseCode) {
		coursePrefix = courseCode.value();
	}

	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext arg1) {
		boolean result = true;
		if(theCode != null) {
			result = theCode.startsWith(coursePrefix);
		}
		else {
			result = true;
		}
		return result;
	}

}
