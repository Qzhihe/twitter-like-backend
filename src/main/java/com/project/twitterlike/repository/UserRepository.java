package com.project.twitterlike.repository;

import com.project.twitterlike.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {}
