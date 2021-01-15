package com.example.restfulwebservice.user;

// HTTP Status Code
// 2xx -> OK
// 4xx -> Client Error
// 5xx -> Server Error

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        super(message);
    }
}
