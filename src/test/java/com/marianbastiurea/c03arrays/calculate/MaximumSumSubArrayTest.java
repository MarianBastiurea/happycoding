package com.marianbastiurea.c03arrays.calculate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumSumSubArrayTest {
    @Test
    void usingNoDelete(){
        int[] myArray={0,1,2,3,4};
        int result=10;
        assertEquals(result, MaximumSumSubArray.findMaximumNoDelete(myArray));
    }

    @Test
    void usingOneDelete(){
        int[] myArray={0,1,2,3,4};
        int positionToDelete=4;
        int result=6;
        assertEquals(result,MaximumSumSubArray.findMaximumOneDelete(myArray,positionToDelete));
    }
}
