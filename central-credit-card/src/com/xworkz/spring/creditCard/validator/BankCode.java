package com.xworkz.spring.creditCard.validator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = BankCodeConstraintsValidator.class)
@Target({ ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface BankCode {

	public String value() default "CBI";

	public String message() default "must Starts with CBI";

	public Class<?>[] groups() default {};

	// define default payload
	public Class<? extends Payload>[] payload() default {};

}
