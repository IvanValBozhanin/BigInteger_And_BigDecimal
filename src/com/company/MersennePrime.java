package com.company;

import java.math.BigInteger;

public class MersennePrime {
    public static void main(String[] args) {
        System.out.println(3);
        for (int i = 3; i < 98; i += 2) {
            BigInteger bi = new BigInteger(i + "");
            if (bi.isProbablePrime(5)) {
                BigInteger power = BigInteger.TWO.pow(bi.intValue()).subtract(BigInteger.ONE);
                if (power.isProbablePrime(5)) {
                    System.out.println(power);
                }
            }
        }
    }
}