package com.marianbastiurea.c03arrays.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindNumberOfPuzzleSetTest {
    @Test
    void givenAnArrayWith1PuzzleSetShouldReturn1() {
        int[] myArray = {7, 1, 2, 3, 8};
        int result = 1;
        assertEquals(result, FindNumberOfPuzzleSet.findPuzzleSet(myArray));
    }

    @Test
    void givenAnArrayWith2PuzzleSetShouldReturn2() {
        int[] myArray = {0, 3, 1, 2, 8, 10, 9, 11};
        int result = 2;
        assertEquals(result, FindNumberOfPuzzleSet.findPuzzleSet(myArray));
    }

    @Test
    void givenAnEmptyArrayShouldReturn0() {
        int[] myArray = {};
        int result = 0;
        assertEquals(result, FindNumberOfPuzzleSet.findPuzzleSet(myArray));
    }

    @Test
    void givenAnArrayWithSameNumberShouldReturn0() {
        int[] myArray = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int result = 0;
        assertEquals(result, FindNumberOfPuzzleSet.findPuzzleSet(myArray));
    }

    @Test
    void givenArrayWith2ConsecutiveNumbersShouldReturn0() {
        int[] myArray = {0, 0, 0, 0, 0, 1, 0, 0, 0, 0};
        int result = 0;
        assertEquals(result, FindNumberOfPuzzleSet.findPuzzleSet(myArray));
    }

}
