package com.travelport.sum.controller;

import com.travelport.sum.model.SumRequest;
import com.travelport.sum.model.SumResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sum")
public class SumController {

    @PostMapping
    public SumResponse sum(@RequestBody SumRequest sumRequest) {
        System.out.println("Calling me!");
        return new SumResponse(sumRequest.getA() + sumRequest.getB());
    }
}
