package com.company;

import java.math.BigInteger;

public class BigIntegerDivisibility {
    public static void main(String[] args) {
        BigInteger bi = new BigInteger(Long.MAX_VALUE + "");
        int counter = 0;
        final int countTo = 10;
        while(counter < countTo){
            if(bi.remainder(BigInteger.valueOf(5)).equals(BigInteger.ZERO) || bi.remainder(BigInteger.valueOf(6)).equals(BigInteger.ZERO)){
                System.out.println(bi);
                ++ counter;
            }
            bi = bi.add(BigInteger.ONE);
        }
    }
}
