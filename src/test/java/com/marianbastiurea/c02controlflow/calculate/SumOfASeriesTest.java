package com.marianbastiurea.c02controlflow.calculate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumOfASeriesTest {
    @Test
     void firstTest() {
        int x = 2, n = 5;
        double result = SumOfASeries.findSum(x, n);
        assertEquals(result, -0.416d, 0.001);
    }

    @Test
     void secondTest() {
        int x = 3, n = 10;
        String sum = "-0,541";
        double result = SumOfASeries.findSum(x, n);
        assertEquals(result, -0.541d, 0.001);
    }

    @Test
     void thirdTest() {
        int x = -5, n = 1;
        String sum = "1,000";
        double result = SumOfASeries.findSum(x, n);
        assertEquals(result, 1.000d, 0.001);
    }

    @Test
     void fourthTest() {
        int x = -5, n = 2;
        String sum = "-11,500";
        double result = SumOfASeries.findSum(x, n);
        assertEquals(result, -11.500d, 0.001);
    }
}
