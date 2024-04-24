package com.shakratsanzhar.softwarephoenixproject.web.dto.validation.impl;

import com.shakratsanzhar.softwarephoenixproject.web.dto.user.UserCreateDto;
import com.shakratsanzhar.softwarephoenixproject.web.dto.validation.PasswordConfirmationValidator;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PasswordConfirmationValidatorClass implements ConstraintValidator<PasswordConfirmationValidator, UserCreateDto> {

    @Override
    public boolean isValid(UserCreateDto userCreateDto, ConstraintValidatorContext constraintValidatorContext) {
        return userCreateDto.getPassword().equals(userCreateDto.getPasswordConfirmation());
    }
}
