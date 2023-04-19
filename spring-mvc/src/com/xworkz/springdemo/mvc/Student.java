package com.xworkz.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {

	private String firstName;
	private String lastName;
	private String age;
	private String email;
	private String bloodGroup;
	private String phoneNumber;
	private String country;
	private LinkedHashMap<String, String> countryOptions;
	private String favoriteLanguage;
	private String favroiteOS;

	public Student() {
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("", "");
		countryOptions.put("IND", "India");
		countryOptions.put("ARG", "Argentina");
		countryOptions.put("AUS", "Australia");
		countryOptions.put("BMU", "Bermuda");
		countryOptions.put("COL", "Colombia");
		countryOptions.put("KAZ", "Kazakhstan");
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

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public String getFavroiteOS() {
		return favroiteOS;
	}

	public void setFavroiteOS(String favroiteOS) {
		this.favroiteOS = favroiteOS;
	}

}
