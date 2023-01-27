package com.traffic.traffic_peak.result.service;

import com.traffic.traffic_peak.constance.ResultConstance;
import com.traffic.traffic_peak.result.entity.Result;
import com.traffic.traffic_peak.result.repositroy.ResultRepository;
import com.traffic.traffic_peak.result.request.ResultRequest;
import com.traffic.traffic_peak.result.response.ResultResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service @Transactional
@RequiredArgsConstructor
public class ResultService {

    private final ResultRepository resultRepository;

    public ResultResponse result(ResultRequest resultRequest) {
        Result result = resultRepository.save(resultRequest.of());

        return new ResultResponse(true, ResultConstance.SUCCESS_MESSAGE, result);
    }

}
