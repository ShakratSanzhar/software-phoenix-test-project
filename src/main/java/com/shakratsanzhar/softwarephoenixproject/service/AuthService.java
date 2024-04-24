package com.shakratsanzhar.softwarephoenixproject.service;

import com.shakratsanzhar.softwarephoenixproject.repository.UserRepository;
import com.shakratsanzhar.softwarephoenixproject.web.dto.auth.LoginRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository userRepository;

    public Boolean login(LoginRequest loginRequest) {
       return userRepository.existsUserByLoginAndPassword(loginRequest.getLogin(), loginRequest.getPassword());
    }
}
