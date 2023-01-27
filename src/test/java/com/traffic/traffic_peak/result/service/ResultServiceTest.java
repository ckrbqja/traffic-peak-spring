package com.traffic.traffic_peak.result.service;

import com.traffic.traffic_peak.result.entity.Result;
import com.traffic.traffic_peak.result.repositroy.ResultRepository;
import com.traffic.traffic_peak.result.request.ResultRequest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Transactional
class ResultServiceTest {

    @Autowired
    ResultRepository resultRepository;

    @Test @DisplayName("req entity로 변환 후 저장")
    public void saveTest() {
        ResultRequest req = new ResultRequest("orderNumber", "orderItemNumber", "resultObject");
        Result result = req.of();

        Result saveResult = resultRepository.save(result);

        assertThat(result).isEqualTo(saveResult);
    }





}