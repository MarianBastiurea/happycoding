package com.marianbastiurea.c02controlflow.calculate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

 class SumOfIntegerWhichAreDivisibleBy9Test {
    @Test
     void firstOneHundred() {
        int[] myArray = {100, 200};
        int sum = 1683;
        int result = SumOfIntegerWhichAreDivisibleBy9.findSum(myArray);
        assertEquals(result, sum);
    }

    @Test
     void secondHundred() {
        int[] myArray = {200, 300};
        int sum = 2772;
        int result = SumOfIntegerWhichAreDivisibleBy9.findSum(myArray);
        assertEquals(result, sum);
    }

    @Test
     void firstThousand() {
        int[] myArray = {0, 1000};
        int sum = 55944;
        int result = SumOfIntegerWhichAreDivisibleBy9.findSum(myArray);
        assertEquals(result, sum);
    }
}
