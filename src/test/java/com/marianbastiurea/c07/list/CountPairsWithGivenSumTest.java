package com.marianbastiurea.c07.list;

import com.marianbastiurea.c07list.CountPairsWithGivenSum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountPairsWithGivenSumTest {

    @Test
    void onePair() {
        int[] myArray = {1, 2, 3, 4, 5};
        int target = 3;
        int result = 1;
        assertEquals(result, CountPairsWithGivenSum.countPairs(myArray, target));
    }

    @Test
    void twoPairs() {
        int[] myArray = {1, 2, 3, 5, 5};
        int target = 3;
        int result = 1;
        assertEquals(result, CountPairsWithGivenSum.countPairs(myArray, target));
    }

    @Test
    void noPair() {
        int[] myArray = {1, 2, 3, 5, 5};
        int target = 13;
        int result = 0;
        assertEquals(result, CountPairsWithGivenSum.countPairs(myArray, target));
    }
}
