package com.kshrd.kshrd_websiteapi.model.user;

import com.kshrd.kshrd_websiteapi.rest.message.BaseApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.InternalAuthenticationServiceException;
import org.springframework.web.bind.annotation.ControllerAdvice;

import java.sql.Timestamp;

@ControllerAdvice
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(InternalAuthenticationServiceException.class)
    public ResponseEntity<BaseApiResponse<UserResponse>> handleInternalAuthenticationServiceException(InternalAuthenticationServiceException e) {

        BaseApiResponse<UserResponse> response = new BaseApiResponse<>();
        response.setMessage("User not found");
        response.setData(null);
        response.setStatus(HttpStatus.NOT_FOUND);
        response.setTime(new Timestamp(System.currentTimeMillis()));
        return ResponseEntity.ok(response);

    }
}