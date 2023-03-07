package com.project.twitterlike.service;

import com.project.twitterlike.model.User;
import com.project.twitterlike.repository.UserRepository;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUserById(String id) {
        return userRepository.findById(id).orElse(null);
    }
}
