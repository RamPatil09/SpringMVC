package com.xworkx.spring.bristlecone.validator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = EmployeeCodeConstraintValidator.class)
@Target({ ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface EmployeeCode {
	public String value() default "BRI";

	public String message() default "Must be start with BRI";

	public Class<?>[] groups() default {};

	public Class<? extends Payload>[] payload() default {};
}
