package com.project.twitterlike.controller;

import com.project.twitterlike.model.User;
import com.project.twitterlike.service.UserService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

class getUserRequest {
    private String id;
    private String token;

    public getUserRequest() {}

    public getUserRequest(String id, String token) {
        this.id = id;
        this.token = token;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}

@RestController
@CrossOrigin(origins = "http://localhost:8080")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/user")
    public User getUserById(@RequestBody getUserRequest request) {
        return "794443".equals(request.getToken()) ? userService.getUserById(request.getId()) : null;
    }
}
