package com.xworkx.spring.bristlecone.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EmployeeCodeConstraintValidator implements ConstraintValidator<EmployeeCode, String> {

	private String employeeCodePrefix;

	@Override
	public void initialize(EmployeeCode employeeCode) {
		employeeCodePrefix = employeeCode.value();
	}

	@Override
	public boolean isValid(String string, ConstraintValidatorContext constraintValidatorContext) {
		boolean result;

		if (string != null) {
			result = string.startsWith(employeeCodePrefix);
		} else {
			result = true;
		}
		return result;
	}

}
