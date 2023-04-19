package com.xworkz.spring.creditCard;

import java.util.LinkedHashMap;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.xworkz.spring.creditCard.validator.BankCode;

public class AccountOpeningDetails {

	private String applicationDate;

	private String prefix;
	private LinkedHashMap<String, String> prefixOptions;
	@NotEmpty(message = "*")
	private String firstName;
	private String middleName;
	@NotEmpty(message = "*")
	private String surname;
	private String nationality;
	@NotEmpty(message = "*")
	private String panNo;
	@NotEmpty(message = "*")
	private String aadhaarCardNo;
	@NotEmpty(message = "*")
	private String dateOfBirth;
	private String sex;
	private LinkedHashMap<String, String> sexOptions;
	@NotEmpty(message = "*")
	private String motherMaidenName;
	@NotNull(message = "is required")
	private Integer postalCode;
	@BankCode
	private String branchCode;

	public AccountOpeningDetails() {
		prefixOptions = new LinkedHashMap<>();
		prefixOptions.put("Mr.", "Mr.");
		prefixOptions.put("Ms.", "Ms.");
		prefixOptions.put("Mrs.", "Mrs.");

		sexOptions = new LinkedHashMap<>();
		sexOptions.put("Male", "Male");
		sexOptions.put("Female", "Female");
		sexOptions.put("Trans Gender", "Trans Gender");
	}

	public String getApplicationDate() {
		return applicationDate;
	}

	public void setApplicationDate(String applicationDate) {
		this.applicationDate = applicationDate;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	public LinkedHashMap<String, String> getPrefixOptions() {
		return prefixOptions;
	}

	public String getAadhaarCardNo() {
		return aadhaarCardNo;
	}

	public void setAadhaarCardNo(String aadhaarCardNo) {
		this.aadhaarCardNo = aadhaarCardNo;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getMotherMaidenName() {
		return motherMaidenName;
	}

	public void setMotherMaidenName(String motherMaidenName) {
		this.motherMaidenName = motherMaidenName;
	}

	public LinkedHashMap<String, String> getSexOptions() {
		return sexOptions;
	}

	public Integer getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(Integer postalCode) {
		this.postalCode = postalCode;
	}

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

}
