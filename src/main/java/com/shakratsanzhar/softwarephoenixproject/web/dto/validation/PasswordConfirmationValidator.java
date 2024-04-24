package com.shakratsanzhar.softwarephoenixproject.web.dto.validation;

import com.shakratsanzhar.softwarephoenixproject.web.dto.validation.impl.PasswordConfirmationValidatorClass;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = PasswordConfirmationValidatorClass.class)
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface PasswordConfirmationValidator {

    String message() default "Confirmation password and password should be same";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
