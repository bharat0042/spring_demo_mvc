package com.bharat.springdemo.mvc;

import java.util.LinkedHashMap;

import org.springframework.stereotype.Component;

@Component
public class Student {
	
	private String firstName;
	
	private String lastName;
	
	private String country;
	
	private String language;
	
	private String gender;
	
	private LinkedHashMap<String, String> countryOptions;
	
	private LinkedHashMap<String, String> genderOptions;
	
	private String operatingSystem;
	
	private String[] operatingSystemsList = {"Linux", "Windows", "Mac OS"};
	
	public Student() {
		countryOptions = new LinkedHashMap<String, String>();
		countryOptions.put("IN", "India");
		countryOptions.put("BR", "Brazil");
		countryOptions.put("NZ", "New Zealand");
		countryOptions.put("DE", "Germany");
		genderOptions = new LinkedHashMap<String, String>();
		genderOptions.put("Male", "Male");
		genderOptions.put("Female", "Female");
		genderOptions.put("Does not want to disclose", "N/A");
	}

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

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LinkedHashMap<String, String> getGenderOptions() {
		return genderOptions;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public String[] getOperatingSystemsList() {
		return operatingSystemsList;
	}
}
