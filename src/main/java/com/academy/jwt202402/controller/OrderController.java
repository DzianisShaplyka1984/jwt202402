package com.academy.jwt202402.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @GetMapping(value = "/order")
    public ResponseEntity placeOrder() {
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping(value = "/payment")
    public ResponseEntity payment() {
        return new ResponseEntity(HttpStatus.OK);
    }
}
