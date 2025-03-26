package com.marianbastiurea.c02controlflow.calculate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfNEvenTermsTest {
    @Test
    public void firstTen() {
        int number = 10;
        int sum = 110;
        int result = SumOfNEvenTerms.findSum(number);
        assertEquals(result, sum);
    }

    @Test
    public void firstTwenty() {
        int number = 20;
        int sum = 420;
        int result = SumOfNEvenTerms.findSum(number);
        assertEquals(result, sum);
    }

    @Test
    public void firstOneHundred() {
        int number = 100;
        int sum = 10100;
        int result = SumOfNEvenTerms.findSum(number);
        assertEquals(result, sum);
    }
}
