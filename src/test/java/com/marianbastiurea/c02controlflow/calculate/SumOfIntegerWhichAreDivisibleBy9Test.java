package com.marianbastiurea.c02controlflow.calculate;

import static org.junit.jupiter.api.Assertions.*;

import com.marianbastiurea.c02controlflow.calculate.SumOfIntegerWhichAreDivisibleBy9;
import org.junit.jupiter.api.Test;

public class SumOfIntegerWhichAreDivisibleBy9Test {
    @Test
    public void firstOneHundred() {
        int[] myArray = {100, 200};
        int sum = 1683;
        int result = SumOfIntegerWhichAreDivisibleBy9.findSum(myArray);
        assertEquals(result, sum);
    }

    @Test
    public void secondHundred() {
        int[] myArray = {200, 300};
        int sum = 2772;
        int result = SumOfIntegerWhichAreDivisibleBy9.findSum(myArray);
        assertEquals(result, sum);
    }

    @Test
    public void firstThousand() {
        int[] myArray = {0, 1000};
        int sum = 55944;
        int result = SumOfIntegerWhichAreDivisibleBy9.findSum(myArray);
        assertEquals(result, sum);
    }
}
