package com.naivecat.closestprimenumber.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<String> findClosestPrimeNumber() {
        String result = "Hello World";
        return ResponseEntity.ok(result);
    }
}
