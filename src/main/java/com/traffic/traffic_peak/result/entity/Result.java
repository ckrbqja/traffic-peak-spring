package com.traffic.traffic_peak.result.entity;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
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
