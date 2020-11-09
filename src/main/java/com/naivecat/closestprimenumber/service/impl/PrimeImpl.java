package com.naivecat.closestprimenumber.service.impl;

import com.naivecat.closestprimenumber.service.PrimeService;
import org.springframework.stereotype.Service;

@Service
public class PrimeImpl implements PrimeService {

    @Override
    public Long findClosestPrimeNumber(Long origin) {
        Long result = 0l;
        for(Long i = origin ; i > 2 ; i--) {
            if(isPrimeNumber(i)) {
                result = i;
                break;
            }
        }
        return result;
    }

    @Override
    public boolean isPrimeNumber(Long number) {

        return false;
    }
}
