package com.naivecat.closestprimenumber.controller;

import com.naivecat.closestprimenumber.service.PrimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

    /**
     * Find the prime number which is lower but closest to origin number.
     * For example, if user input 69 as a origin number, app will return prime 67.
     * @param origin
     * @return A prime
     */
    @RequestMapping(value = "{origin}", method = RequestMethod.GET)
    public ResponseEntity<Object> findClosestPrimeNumber(@PathVariable("origin") Long origin) {
        Long result = this.primeService.findClosestPrimeNumber(origin);

        if(result > 2) {
            return ResponseEntity.ok(result);
        } else {
            String response = "Origin " + origin + " does not have a lower prime.";
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
        }
    }

}
