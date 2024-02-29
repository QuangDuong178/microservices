package com.example.memberservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MainController {
    @Value("${spring.boot.message}")
    private String message;

    @Autowired
    private APIClient apiClient;

    @GetMapping("/message")
    public ResponseEntity<String> getMessage() {
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    @GetMapping("/department/message")
    public ResponseEntity<String> getMember() {
        String value = apiClient.getMessage();
        return new ResponseEntity<>(value, HttpStatus.OK);
    }

}
