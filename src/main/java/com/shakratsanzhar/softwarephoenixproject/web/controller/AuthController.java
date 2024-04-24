package com.shakratsanzhar.softwarephoenixproject.web.controller;

import com.shakratsanzhar.softwarephoenixproject.service.AuthService;
import com.shakratsanzhar.softwarephoenixproject.service.UserService;
import com.shakratsanzhar.softwarephoenixproject.web.dto.auth.LoginRequest;
import com.shakratsanzhar.softwarephoenixproject.web.dto.user.UserCreateDto;
import com.shakratsanzhar.softwarephoenixproject.web.dto.user.UserReadDto;
import com.shakratsanzhar.softwarephoenixproject.web.dto.validation.group.OnCreate;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
@Tag(
        name = "Auth Controller",
        description = "Auth API"
)
public class AuthController {

    private final AuthService authService;
    private final UserService userService;

    @PostMapping("/login")
    @Operation(summary = "Log in to the system", description = "Log in to the system")
    public Boolean login(
             @RequestBody final LoginRequest loginRequest
    ) {
        return authService.login(loginRequest);
    }

    @PostMapping("/register")
    @Operation(summary = "Register in the system")
    public UserReadDto register(
            @Validated(OnCreate.class)
            @RequestBody final UserCreateDto userDto
    ) {
        return userService.create(userDto);
    }
}
