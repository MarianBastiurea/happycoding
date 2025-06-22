package com.marianbastiurea.c07.list;

import com.marianbastiurea.c07list.LongestConsecutiveSequence;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestConsecutiveSequenceTest {

    @Test
    void givenAnArrayWith4ConsecutiveNumbersFrom7ElementsShouldReturn4() {
        int[] myArray = {100, 4, 200, 1, 3, 2};
        int result = 4;
        assertEquals(result, LongestConsecutiveSequence.longestConsecutive(myArray));

    }

    @Test
    void givenAnArrayWith0ConsecutiveNumbersFrom7ElementsShouldReturn1() {
        int[] myArray = {100, 40, 200, 11, 33, 21};
        int result = 1;
        assertEquals(result, LongestConsecutiveSequence.longestConsecutive(myArray));

    }

    @Test
    void givenAnEmptyArrayShouldReturn0() {
        int[] myArray = {};
        int result = 0;
        assertEquals(result, LongestConsecutiveSequence.longestConsecutive(myArray));

    }
}
