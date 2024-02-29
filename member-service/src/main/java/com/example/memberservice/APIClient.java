package com.example.memberservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("DEPARTMENT-SERVICE")
public interface APIClient {

    @GetMapping("api/message")
    String getMessage();
}
