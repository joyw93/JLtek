package com.jltek.demo.estimate.controller;

import com.jltek.demo.estimate.service.EstimateService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api/v1/estimate")
public class EstimateController {

    @Value("${cors.allowed-origin}")
    private String allowedOrigin;
    private final EstimateService estimateService;

    @PostMapping()
    public ResponseEntity<String> getExample() {
        System.out.println(allowedOrigin);
        String response = "docker test 5";
        return ResponseEntity.ok(response);
    }
}