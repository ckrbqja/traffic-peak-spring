package com.traffic.traffic_peak.result.controller;

import com.traffic.traffic_peak.result.request.ResultRequest;
import com.traffic.traffic_peak.result.response.ResultResponse;
import com.traffic.traffic_peak.result.service.ResultService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ResultController {

    private final ResultService resultService;

    @PostMapping("/result")
    public ResultResponse result(@RequestBody ResultRequest resultRequest) {
        return resultService.result(resultRequest);
    }
}
