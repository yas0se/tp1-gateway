package com.devbuild.inscriptionservice.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "user-service", path = "/users")
public interface UserClient {
    @GetMapping("/{id}")
    UserResponseWrapper getUserById(@PathVariable("id") String id);
}