package com.project.twitterlike.service;

import com.project.twitterlike.model.Poost;
import com.project.twitterlike.repository.PoostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PoostService {
    private final PoostRepository poostRepository;

    public PoostService(PoostRepository poostRepository) {
        this.poostRepository = poostRepository;
    }

    public Poost getPoostBy(String id) {
        return poostRepository.findById(id).orElse(null);
    }

    public List<Poost> getPoosts() {
        return poostRepository.findAll();
    }
}
