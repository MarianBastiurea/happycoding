package com.marianbastiurea.c02controlflow.calculate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

 class SumOfNEvenTermsTest {
    @Test
     void firstTen() {
        int number = 10;
        int sum = 110;
        int result = SumOfNEvenTerms.findSum(number);
        assertEquals(result, sum);
    }

    @Test
     void firstTwenty() {
        int number = 20;
        int sum = 420;
        int result = SumOfNEvenTerms.findSum(number);
        assertEquals(result, sum);
    }

    @Test
     void firstOneHundred() {
        int number = 100;
        int sum = 10100;
        int result = SumOfNEvenTerms.findSum(number);
        assertEquals(result, sum);
    }
}
