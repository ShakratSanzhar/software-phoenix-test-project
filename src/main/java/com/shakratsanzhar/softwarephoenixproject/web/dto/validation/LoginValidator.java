package com.shakratsanzhar.softwarephoenixproject.web.dto.validation;

import com.shakratsanzhar.softwarephoenixproject.web.dto.validation.impl.LoginValidatorClass;
import com.shakratsanzhar.softwarephoenixproject.web.dto.validation.impl.PasswordConfirmationValidatorClass;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = LoginValidatorClass.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface LoginValidator {

    String message() default "This login is already exist";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
