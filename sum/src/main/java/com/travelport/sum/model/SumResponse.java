package com.travelport.sum.model;

public class SumResponse {

    private final Double result;

    public SumResponse(Double result) {
        this.result = result;
    }

    public Double getResult() {
        return result;
    }
}
