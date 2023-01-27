package com.traffic.traffic_peak.controller;

import com.traffic.traffic_peak.controller.dto.HealthCheckDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
    @GetMapping("/health-check")
    public HealthCheckDto hello() {
        return new HealthCheckDto();
    }
}
