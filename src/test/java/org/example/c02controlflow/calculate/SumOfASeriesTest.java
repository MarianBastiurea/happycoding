package org.example.c02controlflow.calculate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SumOfASeriesTest {
    @Test
    public void firstTest() {
        int x = 2, n = 5;
        String sum = "-0,416";
        String result = SumOfASeries.findSum(x, n);
        assertEquals(result, sum);
    }

    @Test
    public void secondTest() {
        int x = 3, n = 10;
        String sum = "-0,541";
        String result = SumOfASeries.findSum(x, n);
        assertEquals(result, sum);
    }

    @Test
    public void thirdTest() {
        int x = -5, n = 1;
        String sum = "1,000";
        String result = SumOfASeries.findSum(x, n);
        assertEquals(result, sum);
    }

    @Test
    public void fourthTest() {
        int x = -5, n = 2;
        String sum = "-11,500";
        String result = SumOfASeries.findSum(x, n);
        assertEquals(result, sum);
    }
}
