package com.traffic.traffic_peak.result.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity @Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Result {
    @Id
    @GeneratedValue
    private Long id;
    private String orderNumber;
    private String orderItemNumber;
    private String resultObject;
}
