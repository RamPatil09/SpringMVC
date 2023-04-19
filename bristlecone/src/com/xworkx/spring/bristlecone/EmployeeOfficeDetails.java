package com.xworkx.spring.bristlecone;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class EmployeeOfficeDetails {

	private String name;

	@NotEmpty(message = "is required")
	@Email(message = "Invalid Email! Please Enter Valid Email ID...")
	private String officeMail;

	@NotNull(message = "is required")
	private Integer employeeId;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOfficeMail() {
		return officeMail;
	}

	public void setOfficeMail(String officeMail) {
		this.officeMail = officeMail;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

}
