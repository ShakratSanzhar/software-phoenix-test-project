package com.shakratsanzhar.softwarephoenixproject.service;

import com.shakratsanzhar.softwarephoenixproject.repository.RequestRepository;
import com.shakratsanzhar.softwarephoenixproject.repository.UserRepository;
import com.shakratsanzhar.softwarephoenixproject.web.dto.request.RequestCreateDto;
import com.shakratsanzhar.softwarephoenixproject.web.dto.request.RequestReadDto;
import com.shakratsanzhar.softwarephoenixproject.web.mapper.RequestCreateMapper;
import com.shakratsanzhar.softwarephoenixproject.web.mapper.RequestReadMapper;
import com.shakratsanzhar.softwarephoenixproject.web.mapper.UserCreateMapper;
import com.shakratsanzhar.softwarephoenixproject.web.mapper.UserReadMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class RequestService {

    private final RequestRepository requestRepository;
    private final RequestCreateMapper requestCreateMapper;
    private final RequestReadMapper requestReadMapper;

    public RequestReadDto create(RequestCreateDto requestCreateDto) {
        requestCreateDto.setCreatedAt(LocalDateTime.now());
        return Optional.of(requestCreateDto)
                .map(requestCreateMapper::map)
                .map(requestRepository::save)
                .map(requestReadMapper::map)
                .orElseThrow();
    }

    public List<RequestReadDto> findAllRequests() {
        return requestRepository.findAll().stream()
                .map(requestReadMapper::map)
                .toList();
    }
}
