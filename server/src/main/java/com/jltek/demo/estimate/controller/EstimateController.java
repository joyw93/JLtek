package com.jltek.demo.estimate.controller;

import com.jltek.demo.common.response.ApiResponse;
import com.jltek.demo.common.response.ApiResponseMessage;
import com.jltek.demo.estimate.dto.EstimateRequestDto;
import com.jltek.demo.estimate.dto.EstimateResponseDto;
import com.jltek.demo.estimate.service.EstimateService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.ArrayList;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api/v1/estimate")
public class EstimateController {

    private final EstimateService estimateService;

    @GetMapping()
    public ResponseEntity<ApiResponse> getAllEstimates() {
        List<EstimateResponseDto> estimates = estimateService.getAllEstimates();
        return ResponseEntity.ok(ApiResponse.success(ApiResponseMessage.GET_SUCCESS, estimates));
    }

    @PostMapping()
    public ResponseEntity<ApiResponse> postEstimate(@RequestBody EstimateRequestDto estimateRequestDto) {
        Long estimateId = estimateService.postEstimate(estimateRequestDto);
        return ResponseEntity.ok(ApiResponse.success(ApiResponseMessage.POST_SUCCESS, estimateId));
    }
}