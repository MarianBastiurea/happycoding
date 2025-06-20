package com.marianbastiurea.c07.list;

import com.marianbastiurea.c07list.SubArraySumEqualsK;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubArraySumEqualsKTest {

    @Test
    void given123AsArrayAndKEqual3ShouldReturn2(){
        int[] myArray = {1, 2, 3};
        int k = 3;
        int result=2;
        assertEquals(result, SubArraySumEqualsK.subArraySum(myArray,k));
    }

    @Test
    void givenEmptyArrayAndK1ShouldReturn0(){
        int[] myArray={};
        int k=1;
        int result=0;
        assertEquals(result, SubArraySumEqualsK.subArraySum(myArray,k));
    }

    @Test
    void givenArrayWithNumberNonAndK1ShouldReturn0(){
        int[] myArray={1,2,3,4};
        int k=100;
        int result=0;
        assertEquals(result, SubArraySumEqualsK.subArraySum(myArray,k));
    }

}
