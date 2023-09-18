package com.jltek.demo.estimate.controller;

import com.jltek.demo.estimate.service.EstimateService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api/v1/estimate")
public class EstimateController {
    private final EstimateService estimateService;

    @PostMapping()
    public ResponseEntity<String> getExample() {
        String response = "Hello, World!";
        return ResponseEntity.ok(response);
    }
}