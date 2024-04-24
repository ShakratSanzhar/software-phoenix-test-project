package com.shakratsanzhar.softwarephoenixproject.web.dto.user;

import com.shakratsanzhar.softwarephoenixproject.web.dto.validation.LoginValidator;
import com.shakratsanzhar.softwarephoenixproject.web.dto.validation.PasswordConfirmationValidator;
import com.shakratsanzhar.softwarephoenixproject.web.dto.validation.group.OnCreate;
import io.swagger.v3.oas.annotations.Hidden;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@PasswordConfirmationValidator(groups = {OnCreate.class})
public class UserCreateDto {

    @NotEmpty(message = "Login shouldn't be empty", groups = {OnCreate.class})
    @LoginValidator(groups = {OnCreate.class})
    private String login;

    @NotEmpty(message = "Password shouldn't be empty", groups = {OnCreate.class})
    private String password;

    @NotEmpty(message = "Confirmation password shouldn't be empty", groups = {OnCreate.class})
    private String passwordConfirmation;

    @NotEmpty(message = "Full name shouldn't be empty", groups = {OnCreate.class})
    private String fullName;

    @NotEmpty(message = "Avatar shouldn't be empty", groups = {OnCreate.class})
    private String avatar;

    @Hidden
    private LocalDateTime createdAt;
}
