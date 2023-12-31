package com.jltek.demo.estimate.service;

import com.jltek.demo.estimate.dto.EstimateRequestDto;
import com.jltek.demo.estimate.dto.EstimateResponseDto;
import java.util.List;
import java.util.ArrayList;

public interface EstimateService {
    Long postEstimate(EstimateRequestDto estimateRequestDto);
    List<EstimateResponseDto> getAllEstimates();
}
