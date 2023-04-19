package com.xworkx.spring.bristlecone;

import java.util.LinkedHashMap;

public class EmployeeDetails {

	private String firstName;
	private String lastName;
	private String bloodGroup;
	private LinkedHashMap<String, String> bloodGroupOptions;

	private String contactNumber;
	private String workExperience;
	private String favoriteLanguages;

	private String employeeCode;

	public EmployeeDetails() {
		bloodGroupOptions = new LinkedHashMap<>();
		bloodGroupOptions.put("", "Select your Blood Group");
		bloodGroupOptions.put("A positive", "A+");
		bloodGroupOptions.put("A negative", "A-");
		bloodGroupOptions.put("B positive", "B+");
		bloodGroupOptions.put("B negative", "B-");
		bloodGroupOptions.put("O positive", "O+");
		bloodGroupOptions.put("O negative", "O-");
		bloodGroupOptions.put("AB positive", "AB+");
		bloodGroupOptions.put("AB negative", "AB-");
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

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public LinkedHashMap<String, String> getBloodGroupOptions() {
		return bloodGroupOptions;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getWorkExperience() {
		return workExperience;
	}

	public void setWorkExperience(String workExperience) {
		this.workExperience = workExperience;
	}

	public String getFavoriteLanguages() {
		return favoriteLanguages;
	}

	public void setFavoriteLanguages(String favoriteLanguages) {
		this.favoriteLanguages = favoriteLanguages;
	}

	public String getEmployeeCode() {
		return employeeCode;
	}

	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}

}
