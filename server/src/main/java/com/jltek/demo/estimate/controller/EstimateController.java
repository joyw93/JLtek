package com.jltek.demo.estimate.controller;

import com.jltek.demo.estimate.service.EstimateService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api/v1/estimate")
public class EstimateController {
    private final EstimateService estimateService;

    @PostMapping()
    public ResponseEntity<String> getExample() {
        String response = "docker test";
        return ResponseEntity.ok(response);
    }
}