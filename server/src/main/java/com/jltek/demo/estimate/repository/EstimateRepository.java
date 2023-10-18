package com.jltek.demo.estimate.repository;

import com.jltek.demo.estimate.model.Estimate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstimateRepository extends JpaRepository<Estimate, Long> {
}
