package com.naivecat.closestprimenumber.service;

public interface PrimeService {
    public Long findClosestPrimeNumber(Long origin);
    public boolean isPrimeNumber(Long number);
}
