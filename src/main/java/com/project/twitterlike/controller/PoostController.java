package com.project.twitterlike.controller;

import com.project.twitterlike.model.Poost;
import com.project.twitterlike.service.PoostService;

import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

class GetPoostByRequest {
    private String id;
    private String token;

    public GetPoostByRequest() {}

    public GetPoostByRequest(String id, String token) {
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

class GetPoostsRequest {
    private String token;

    public GetPoostsRequest() {}

    public GetPoostsRequest(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:8080")
public class PoostController {
    private final PoostService poostService;
    private final ResourceLoader resourceLoader;

    public PoostController(PoostService poostService, ResourceLoader resourceLoader) {
        this.poostService = poostService;
        this.resourceLoader = resourceLoader;
    }

    @PostMapping("/poost")
    public Poost getPoostBy(@RequestBody GetPoostByRequest request) {
        return "794443".equals(request.getToken()) ? poostService.getPoostBy(request.getId()) : null;
    }

    @PostMapping("/poosts")
    public ResponseEntity<List<Resource>> getPoosts(@RequestBody GetPoostsRequest request) {
        List<Resource> resources = new ArrayList<>();

        List<Poost> rawPoosts = "794443".equals(request.getToken()) ? poostService.getPoosts() : null;

        if (rawPoosts != null) {
            for (Poost post: rawPoosts) {
                resources.add(resourceLoader.getResource("classpath:/src/main/resources/uploads/" + post.getPic()));
                System.out.println(resources.get(0).getFilename());
            }
        }

        return ResponseEntity.ok(resources);
    }
}
