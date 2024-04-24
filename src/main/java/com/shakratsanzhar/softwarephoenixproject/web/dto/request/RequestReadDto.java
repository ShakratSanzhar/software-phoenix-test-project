package com.shakratsanzhar.softwarephoenixproject.web.dto.request;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class RequestReadDto {

    private String item;
    private Long amount;
    private String deliveryAddress;
    private String phone;
    private LocalDateTime createdAt;
}
