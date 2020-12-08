package com.company;

import java.math.BigInteger;

public class FindBigPrimes {
    public static void main(String[] args) {
        BigInteger number = new BigInteger(Long.MAX_VALUE + "");
        int count = 0;
        final int NUMBER_OF_PRIMES = 5;
        while (count < NUMBER_OF_PRIMES) {
            number = number.add(new BigInteger("1"));
            if (number.isProbablePrime(5)){
                count++;
                System.out.println(number);
            }
        }
    }
}