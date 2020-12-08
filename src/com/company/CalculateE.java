package com.company;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CalculateE {
    public static void main(String[] args) {
        for(int i = 100; i<=1000; i+=100){
            printE(i);
        }
    }
    public static void printE(int k){
        BigDecimal e = BigDecimal.ONE;
        BigDecimal fact = BigDecimal.ONE;
        for(int i = 1; i <= 100; ++i){
            fact = fact.multiply(BigDecimal.valueOf(i));
            e = e.add(BigDecimal.ONE.divide(fact, 25, RoundingMode.CEILING));
        }
        System.out.println(e);
    }
}