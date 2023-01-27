package com.traffic.traffic_peak.result.request;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.traffic.traffic_peak.result.entity.Result;
import lombok.*;


@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor(access =AccessLevel.PROTECTED)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class ResultRequest {
    private String orderNumber;
    private String orderItemNumber;
    private String resultObject;

    public Result of() {
        return new Result(null, this.orderNumber, this.orderItemNumber, this.resultObject);
    }
}
