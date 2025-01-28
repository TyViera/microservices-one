package com.travelport.calculator.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class RestConfig {
    //
//    @Bean
//    public RestClient.Builder restClient() {
//        return RestClient.builder().baseUrl("http://localhost:8010").build();
//    }
//
//    @Bean
//    public RestClient.Builder restClient(EurekaClient eurekaClient) {
//        //always the first
//        var service = eurekaClient
//                .getApplication("sum-microservice")
//                .getInstances()
//                .getFirst();
//        return RestClient.builder().baseUrl("http://%s:%s".formatted(service.getHostName(), service.getPort()));
//    }

    @Bean
    @LoadBalanced
    public RestClient.Builder restClient() {
        return RestClient.builder().baseUrl("http://sum-microservice");
    }
}
