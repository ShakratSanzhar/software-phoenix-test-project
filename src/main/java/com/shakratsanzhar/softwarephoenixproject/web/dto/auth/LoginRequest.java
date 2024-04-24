package com.shakratsanzhar.softwarephoenixproject.web.dto.auth;

import lombok.Data;

@Data
public class LoginRequest {

    private String login;

    private String password;
}
