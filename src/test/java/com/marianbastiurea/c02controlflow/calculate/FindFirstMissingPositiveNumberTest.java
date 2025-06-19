package com.marianbastiurea.c02controlflow.calculate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindFirstMissingPositiveNumberTest {

    @Test
    void given012ShouldReturn3() {
        int[] myArray = {1, 2, 0};
        int result = 3;
        assertEquals(result, FindFirstMissingPositiveNumber.firstMissingPositive(myArray));
    }

    @Test
    void given1Minus13ShouldReturn2() {
        int[] myArray = {4, 3, 1, -1};
        int result = 2;
        assertEquals(result, FindFirstMissingPositiveNumber.firstMissingPositive(myArray));
    }

    @Test
    void givenEmptyArrayShouldReturn1() {
        int[] myArray = {};
        int result = 1;
        assertEquals(result, FindFirstMissingPositiveNumber.firstMissingPositive(myArray));
    }

    @Test
    void givenAnArrayWithNumbersBiggerThan1ShouldReturn1() {
        int[] myArray = {3, 5, 2, 8, 6};
        int result = 1;
        assertEquals(result, FindFirstMissingPositiveNumber.firstMissingPositive(myArray));
    }

}
