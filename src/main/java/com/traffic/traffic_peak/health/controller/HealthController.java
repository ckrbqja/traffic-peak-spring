package com.traffic.traffic_peak.health.controller;

import com.traffic.traffic_peak.health.controller.dto.HealthCheckDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HealthController {
    @GetMapping("/health-check")
    public HealthCheckDto hello() {
        return new HealthCheckDto();
    }
}
