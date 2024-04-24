package com.shakratsanzhar.softwarephoenixproject.web.mapper;

import com.shakratsanzhar.softwarephoenixproject.domain.entity.User;
import com.shakratsanzhar.softwarephoenixproject.web.dto.user.UserReadDto;
import org.springframework.stereotype.Component;

@Component
public class UserReadMapper implements Mapper<User, UserReadDto> {

    @Override
    public UserReadDto map(User object) {
        UserReadDto userReadDto = new UserReadDto();
        userReadDto.setId(object.getId());
        userReadDto.setLogin(object.getLogin());
        userReadDto.setFullName(object.getFullName());
        userReadDto.setAvatar(object.getAvatar());
        userReadDto.setCreatedAt(object.getCreatedAt());
        return userReadDto;
    }
}
