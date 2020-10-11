package com.bharat.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.bharat.springdemo.mvc.validation.CourseCode;

public class Customer {

	private String firstName;
		
	@Size(min = 1, message = "is required")
	@NotNull(message = "is required")
	private String lastName;
	
	@Min(value=0, message = "Min value of 1 is required")
	@Max(value=10, message = "Max value can be 10")
	@NotNull(message = "is required")
	private Integer freePass;
	
	@CourseCode(value = "ECE-", message = "should start with ECE-")
	private String courseCode;
	
	@Pattern(regexp = "\\w{6}", message = "Not a valid postal code")
	private String postalCode;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getFreePass() {
		return freePass;
	}

	public void setFreePass(Integer freePass) {
		this.freePass = freePass;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
}
