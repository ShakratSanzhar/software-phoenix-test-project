package com.shakratsanzhar.softwarephoenixproject.web.mapper;

import com.shakratsanzhar.softwarephoenixproject.domain.entity.Request;
import com.shakratsanzhar.softwarephoenixproject.web.dto.request.RequestReadDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
public class RequestReadMapper implements Mapper<Request, RequestReadDto> {

    @Override
    public RequestReadDto map(Request object) {
        RequestReadDto requestReadDto = new RequestReadDto();
        requestReadDto.setItem(object.getItem());
        requestReadDto.setAmount(object.getAmount());
        requestReadDto.setDeliveryAddress(object.getDeliveryAddress());
        requestReadDto.setPhone(object.getPhone());
        requestReadDto.setCreatedAt(object.getCreatedAt());
        return requestReadDto;
    }
}
