package com.shakratsanzhar.softwarephoenixproject.web.dto.validation.impl;

import com.shakratsanzhar.softwarephoenixproject.repository.UserRepository;
import com.shakratsanzhar.softwarephoenixproject.web.dto.validation.LoginValidator;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class LoginValidatorClass implements ConstraintValidator<LoginValidator,String> {

    private final UserRepository userRepository;

    @Override
    public boolean isValid(String login, ConstraintValidatorContext constraintValidatorContext) {
        return !userRepository.existsUserByLogin(login);
    }
}
