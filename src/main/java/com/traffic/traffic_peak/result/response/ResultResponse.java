package com.traffic.traffic_peak.result.response;

import com.traffic.traffic_peak.result.entity.Result;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ResultResponse {
    private Boolean result;
    private String message;
    private Result data;
}
