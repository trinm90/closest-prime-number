package com.naivecat.closestprimenumber.controller;

import com.naivecat.closestprimenumber.service.PrimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/prime/")
public class PrimeNumberController {

    @Autowired
    private PrimeService primeService;

    @RequestMapping(value = "{origin}", method = RequestMethod.GET)
    public ResponseEntity<Long> findClosestPrimeNumber(@PathVariable("origin") Long origin) {
        Long result = this.primeService.findClosestPrimeNumber(origin);
        return ResponseEntity.ok(result);
    }
}
