package com.marianbastiurea.c01operators.calculate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TwoIntegersSumTest {
    @Test
   void givenSamePositiveAndNegativeNumbersSumShouldBe0() {
        int firstInteger = -2, secondInteger = 2;
        int sum = 0;
        int result = TwoIntegersSum.findSum(firstInteger, secondInteger);
        assertEquals(result, sum);
    }

    @Test
     void givenOneNumberAs0SumShouldBeEqualWithSecondNumber() {
        int firstInteger = 0, secondInteger = 4;
        int sum = 4;
        int result = TwoIntegersSum.findSum(firstInteger, secondInteger);
        assertEquals(result, sum);
    }
}
