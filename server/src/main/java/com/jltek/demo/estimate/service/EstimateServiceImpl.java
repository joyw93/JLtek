package com.jltek.demo.estimate.service;

import com.jltek.demo.estimate.dto.EstimateRequestDto;
import com.jltek.demo.estimate.dto.EstimateResponseDto;
import com.jltek.demo.estimate.model.Estimate;
import com.jltek.demo.estimate.repository.EstimateRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@RequiredArgsConstructor
@Service
public class EstimateServiceImpl implements EstimateService{

    private final EstimateRepository estimateRepository;

    @Override
    public Long postEstimate(EstimateRequestDto estimateRequestDto) {
        Estimate estimate = new Estimate();
        estimate.setTitle(estimateRequestDto.getTitle());
        estimate.setContent(estimateRequestDto.getContent());
        Estimate newEstimate = estimateRepository.save(estimate);
        return newEstimate.getId();
    }

    @Override
    public ArrayList<EstimateResponseDto> getAllEstimates() {
        EstimateResponseDto estimateResponseDto = new EstimateResponseDto();

        return null;
    }
}
