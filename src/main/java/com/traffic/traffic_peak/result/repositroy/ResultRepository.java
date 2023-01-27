package com.traffic.traffic_peak.result.repositroy;

import com.traffic.traffic_peak.result.entity.Result;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResultRepository extends JpaRepository<Result, Long> {
}
