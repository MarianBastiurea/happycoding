package com.marianbastiurea.c05recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumUsingRecursionTest {
    @Test
    void given1AsStartNumberAnd5AsConsecutiveNumberToAddShouldReturn15AsSumOfThem() {
        // start=1 is the first number to sum
        // numbersToAdd is first 5 natural numbers starting with 1
        int start = 1;
        int numbersToAdd = 5;
        int resultSum = 15;
        int result = SumUsingRecursion.sumFirstNNaturalNumbers(start, numbersToAdd);
        assertEquals(resultSum, result);
    }
}
