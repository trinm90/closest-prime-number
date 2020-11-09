package com.naivecat.closestprimenumber.service.impl;

import com.naivecat.closestprimenumber.service.PrimeService;
import org.springframework.stereotype.Service;

@Service
public class PrimeImpl implements PrimeService {

    @Override
    public Long findClosestPrimeNumber(Long origin) {
        return origin;
    }

    @Override
    public boolean isPrimeNumber(Long number) {
        return false;
    }
}
