package com.example.departmentservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("MEMBER-SERVICE")
public interface APIClient {

    @GetMapping("api/message")
    String getMessage();

}
