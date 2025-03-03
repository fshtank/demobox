package com.fshtank.demo.controller;

import com.fshtank.demo.model.UserDTO;
import com.fshtank.demo.service.RestClientService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/client")
public class RestClientController {

    private final RestClientService restClientService;

    @Autowired
    public RestClientController(RestClientService restClientService) {
        this.restClientService = restClientService;
    }

    @GetMapping("/users/{id}")
    public UserDTO getUser(@PathVariable Long id) {
        return restClientService.getUserById(id);
    }

    @PostMapping("/users")
    public UserDTO createUser(@RequestBody UserDTO user) {
        return restClientService.createUser(user);
    }
}
