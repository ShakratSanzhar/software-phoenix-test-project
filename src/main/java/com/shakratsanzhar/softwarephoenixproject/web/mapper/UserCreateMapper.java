package com.shakratsanzhar.softwarephoenixproject.web.mapper;

import com.shakratsanzhar.softwarephoenixproject.domain.entity.User;
import com.shakratsanzhar.softwarephoenixproject.web.dto.user.UserCreateDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Component
public class UserCreateMapper implements Mapper<UserCreateDto, User> {

    @Override
    public User map(UserCreateDto object) {
        User user = new User();
        user.setLogin(object.getLogin());
        user.setPassword(object.getPassword());
        user.setPasswordConfirmation(object.getPasswordConfirmation());
        user.setFullName(object.getFullName());
        user.setAvatar(object.getAvatar());
        user.setCreatedAt(object.getCreatedAt());
        return user;
    }
}
