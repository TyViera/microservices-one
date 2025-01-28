package com.travelport.calculator.service;

import com.travelport.calculator.model.SumRequest;
import com.travelport.calculator.model.SumResponse;

public interface OperationsService {
    SumResponse sum(SumRequest sumRequest);
}
