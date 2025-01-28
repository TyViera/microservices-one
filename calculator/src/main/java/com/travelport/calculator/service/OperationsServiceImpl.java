package com.travelport.calculator.service;

import com.travelport.calculator.model.SumRequest;
import com.travelport.calculator.model.SumResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class OperationsServiceImpl implements OperationsService {

    private final RestClient.Builder restClient;

    public OperationsServiceImpl(RestClient.Builder restClient) {
        this.restClient = restClient;
    }

    @Override
    public SumResponse sum(SumRequest sumRequest) {
        return restClient.build().post()
                .uri("sum")
                .body(sumRequest)
                .retrieve()
                .body(SumResponse.class);
    }
}
