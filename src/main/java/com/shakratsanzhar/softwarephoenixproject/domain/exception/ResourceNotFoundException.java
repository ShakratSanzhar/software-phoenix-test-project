package com.shakratsanzhar.softwarephoenixproject.domain.exception;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(
            final String message
    ) {
        super(message);
    }
}
