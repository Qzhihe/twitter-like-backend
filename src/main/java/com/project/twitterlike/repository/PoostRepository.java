package com.project.twitterlike.repository;

import com.project.twitterlike.model.Poost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PoostRepository extends JpaRepository<Poost, String> {}
