package com.shakratsanzhar.softwarephoenixproject.web.dto.request;

import com.shakratsanzhar.softwarephoenixproject.web.dto.validation.group.OnCreate;
import io.swagger.v3.oas.annotations.Hidden;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class RequestCreateDto {

    @NotEmpty(message = "Item shouldn't be empty", groups = {OnCreate.class})
    private String item;

    @PositiveOrZero(message = "Amount should be positive value or zero", groups = {OnCreate.class})
    @NotEmpty(message = "Amount shouldn't be empty", groups = {OnCreate.class})
    private Long amount;

    @NotEmpty(message = "Delivery address shouldn't be empty", groups = {OnCreate.class})
    private String deliveryAddress;

    @NotEmpty(message = "Phone shouldn't be empty", groups = {OnCreate.class})
    private String phone;

    @Hidden
    private LocalDateTime createdAt;
}
