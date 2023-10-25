package com.jltek.demo.estimate.service;

import com.jltek.demo.estimate.dto.EstimateRequestDto;
import com.jltek.demo.estimate.dto.EstimateResponseDto;
import com.jltek.demo.estimate.model.Estimate;
import com.jltek.demo.estimate.model.QEstimate;
import com.jltek.demo.estimate.repository.EstimateRepository;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class EstimateServiceImpl implements EstimateService{

    private final EstimateRepository estimateRepository;
    private final JPAQueryFactory queryFactory;



    @Override
    public Long postEstimate(EstimateRequestDto estimateRequestDto) {
        Estimate estimate = new Estimate();
        estimate.setTitle(estimateRequestDto.getTitle());
        estimate.setContent(estimateRequestDto.getContent());
        Estimate newEstimate = estimateRepository.save(estimate);
        return newEstimate.getId();
    }

    @Override
    public List<EstimateResponseDto> getAllEstimates() {
        List<Estimate> allEstimates = estimateRepository.findAll();
        QEstimate estimate = QEstimate.estimate; // Q타입 클래스

        List<EstimateResponseDto> results = queryFactory
                .select(Projections.constructor(EstimateResponseDto.class, estimate.title, estimate.content))
                .from(estimate)
                .fetch();

        return results;
    }
}
