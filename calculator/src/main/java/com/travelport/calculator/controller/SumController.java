package com.travelport.calculator.controller;

import com.travelport.calculator.model.SumRequest;
import com.travelport.calculator.model.SumResponse;
import com.travelport.calculator.service.OperationsService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class SumController {

    private final OperationsService operationsService;

    public SumController(OperationsService operationsService) {
        this.operationsService = operationsService;
    }

    @PostMapping("/sum")
    public SumResponse sum(@RequestBody SumRequest sumRequest) {
        return operationsService.sum(sumRequest);
    }
}
