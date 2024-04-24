package com.shakratsanzhar.softwarephoenixproject.web.mapper;

import com.shakratsanzhar.softwarephoenixproject.domain.entity.Request;
import com.shakratsanzhar.softwarephoenixproject.domain.entity.User;
import com.shakratsanzhar.softwarephoenixproject.web.dto.request.RequestCreateDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class RequestCreateMapper implements Mapper<RequestCreateDto, Request> {

    @Override
    public Request map(RequestCreateDto object) {
        Request request = new Request();
        request.setItem(object.getItem());
        request.setAmount(object.getAmount());
        request.setDeliveryAddress(object.getDeliveryAddress());
        request.setPhone(object.getPhone());
        request.setCreatedAt(object.getCreatedAt());
        return request;
    }
}
