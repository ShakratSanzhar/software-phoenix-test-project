package com.shakratsanzhar.softwarephoenixproject.web.dto.user;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserReadDto {

    private Long id;
    private String login;
    private String fullName;
    private String avatar;
    private LocalDateTime createdAt;
}
