package com.shakratsanzhar.softwarephoenixproject.web.controller;

import com.shakratsanzhar.softwarephoenixproject.service.RequestService;
import com.shakratsanzhar.softwarephoenixproject.web.dto.request.RequestCreateDto;
import com.shakratsanzhar.softwarephoenixproject.web.dto.request.RequestReadDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/requests")
@RequiredArgsConstructor
@Tag(
        name = "Request Controller",
        description = "Request API"
)
public class RequestController {

    private final RequestService requestService;

    @PostMapping()
    @Operation(summary = "New request", description = "Create new request")
    public RequestReadDto createNewRequest(
            @RequestBody final RequestCreateDto requestCreateDto
    ) {
        return requestService.create(requestCreateDto);
    }

    @GetMapping()
    @Operation(summary = "All requests", description = "Retrieve all requests")
    public List<RequestReadDto> getAllRequests() {
        return requestService.findAllRequests();
    }
}
