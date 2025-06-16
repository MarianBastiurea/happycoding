package com.marianbastiurea.c03arrays.calculate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestSubarrayWithSumDivisibleByKTest {

    @Test
    void givenLongestSubArrayWithSumEquals18From4NumbersAndKEqualWith3ShouldReturn4(){
        int[] myArray={2,7,6,1,4,5};
        int k=3;
        int result=4;
        assertEquals(result, LongestSubarrayWithSumDivisibleByK. findLength(myArray,k));

    }

    @Test
    void givenLongestSubArrayWithSumEquals50From4NumbersAndKEquals5ShouldReturn4(){
        int[] myArray={5,10,15,20};
        int k=5;
        int result=4;
        assertEquals(result, LongestSubarrayWithSumDivisibleByK. findLength(myArray,k));

    }

    @Test
    void givenAnArrayWithNumbersNotDivisibleWithKShouldReturn0(){
        int[] myArray={1,2,3};
        int k=7;
        int result =0;
        assertEquals(result, LongestSubarrayWithSumDivisibleByK. findLength(myArray,k));
    }
}
