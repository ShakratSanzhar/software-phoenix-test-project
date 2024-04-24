package com.shakratsanzhar.softwarephoenixproject.service;

import com.shakratsanzhar.softwarephoenixproject.repository.UserRepository;
import com.shakratsanzhar.softwarephoenixproject.web.dto.user.UserCreateDto;
import com.shakratsanzhar.softwarephoenixproject.web.dto.user.UserReadDto;
import com.shakratsanzhar.softwarephoenixproject.web.mapper.UserCreateMapper;
import com.shakratsanzhar.softwarephoenixproject.web.mapper.UserReadMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class UserService {

    private final UserRepository userRepository;
    private final UserCreateMapper userCreateMapper;
    private final UserReadMapper userReadMapper;

    public UserReadDto create(UserCreateDto userCreateDto) {
        userCreateDto.setCreatedAt(LocalDateTime.now());
        return Optional.of(userCreateDto)
                .map(userCreateMapper::map)
                .map(userRepository::save)
                .map(userReadMapper::map)
                .orElseThrow();
    }
}
