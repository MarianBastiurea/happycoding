package com.marianbastiurea.c02controlflow.calculate;

import static org.junit.jupiter.api.Assertions.*;

import com.marianbastiurea.c02controlflow.calculate.SumAndAverageOf10Numbers;
import org.junit.jupiter.api.Test;

public class SumAndAverageOf10NumbersTest {
    @Test
    public void fortyFive() {
        double[] myArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        double[] sumAndAverage = {45, 4.5};
        double[] result = SumAndAverageOf10Numbers.findSum(myArray);
        assertArrayEquals(result, sumAndAverage);
    }

    @Test
    public void zero() {
        double[] myArray = {0};
        double[] sumAndAverage = {0, 0};
        double[] result = SumAndAverageOf10Numbers.findSum(myArray);
        assertArrayEquals(result, sumAndAverage);
    }

    @Test
    public void negativeNumber() {
        double[] myArray = {0, -1, -2, -3, -4, -5, -6, -7, -8, -9};
        double[] sumAndAverage = {-45, -4.5};
        double[] result = SumAndAverageOf10Numbers.findSum(myArray);
        assertArrayEquals(result, sumAndAverage);
    }

    @Test
    public void sameZero() {
        double[] myArray = {0, -1, 2, 3, -4, -6, 7, 8, -9};
        double[] sumAndAverage = {0, 0};
        double[] result = SumAndAverageOf10Numbers.findSum(myArray);
        assertArrayEquals(result, sumAndAverage);
    }
}
