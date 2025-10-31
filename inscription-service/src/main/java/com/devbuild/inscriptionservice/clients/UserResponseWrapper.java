package com.devbuild.inscriptionservice.clients;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserResponseWrapper {
    private boolean success;
    private String message;
    private UserResponse data;
}

