package org.example.c05recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class sumUsingRecursionTest {
    @Test
    public void given1AsStartNumberAnd5AsConsecutiveNumberToAddShouldReturn15AsSumOfThem() {
        // start=1 is the first number to sum
        // NumbersToAdd is first 5 natural numbers starting with 1
        int start = 1;
        int NumbersToAdd = 5;
        int resultSum = 15;
        int result = SumUsingRecursion.sumFirstNNaturalNumbers(start, NumbersToAdd);
        assertEquals(result, resultSum);
    }
}
