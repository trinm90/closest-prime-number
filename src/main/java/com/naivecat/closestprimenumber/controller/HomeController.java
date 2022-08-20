package com.naivecat.closestprimenumber.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<String> findClosestPrimeNumber() {
        String result = "Hello World from https://www.bachwa.vn/";
        return ResponseEntity.ok(result);
    }
    
}
