package com.xworkz.spring.creditCard.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class BankCodeConstraintsValidator implements ConstraintValidator<BankCode, String> {

	private String bankPrefix;

	@Override
	public void initialize(BankCode theBankCode) {
		// TODO Auto-generated method stub
		bankPrefix = theBankCode.value();
	}

	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext) {
		boolean result;
		if (theCode != null) {
			result = theCode.startsWith(bankPrefix);
		} else {
			result = true;
		}
		return result;
	}

}
