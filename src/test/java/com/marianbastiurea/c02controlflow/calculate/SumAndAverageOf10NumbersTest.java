package com.marianbastiurea.c02controlflow.calculate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SumAndAverageOf10NumbersTest {
    @Test
     void fortyFive() {
        double[] myArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        double[] sumAndAverage = {45, 4.5};
        double[] result = SumAndAverageOf10Numbers.findSum(myArray);
        assertArrayEquals(result, sumAndAverage);
    }

    @Test
    void zero() {
        double[] myArray = {0};
        double[] sumAndAverage = {0, 0};
        double[] result = SumAndAverageOf10Numbers.findSum(myArray);
        assertArrayEquals(result, sumAndAverage);
    }

    @Test
     void negativeNumber() {
        double[] myArray = {0, -1, -2, -3, -4, -5, -6, -7, -8, -9};
        double[] sumAndAverage = {-45, -4.5};
        double[] result = SumAndAverageOf10Numbers.findSum(myArray);
        assertArrayEquals(result, sumAndAverage);
    }

    @Test
     void sameZero() {
        double[] myArray = {0, -1, 2, 3, -4, -6, 7, 8, -9};
        double[] sumAndAverage = {0, 0};
        double[] result = SumAndAverageOf10Numbers.findSum(myArray);
        assertArrayEquals(result, sumAndAverage);
    }
}
