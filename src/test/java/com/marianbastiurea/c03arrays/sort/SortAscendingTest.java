package com.marianbastiurea.c03arrays.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

 class SortAscendingTest {

    @Test
     void givenUnsortedArrayShouldReturnSortedArray(){
        int[] unsortedArray={2,1,6,8,0};
        int[] sortedArray={0,1,2,6,8};
        int[]result=SortAscending.sortArray(unsortedArray);
        assertArrayEquals(sortedArray,result);
    }
}
