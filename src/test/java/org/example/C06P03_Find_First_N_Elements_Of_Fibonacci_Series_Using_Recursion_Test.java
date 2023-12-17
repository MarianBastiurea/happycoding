package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class C06P03_Find_First_N_Elements_Of_Fibonacci_Series_Using_Recursion_Test {
    @Test
    public void First5Element(){
        int NumberOfElements=5;
        int[] resultArray={0,1,1,2,3};
        int[] result= C06P03_Find_First_N_Elements_Of_Fibonacci_Series_Using_Recursion.FirstNElements(NumberOfElements);
        assertArrayEquals(resultArray, result);
    }
    @Test
    public void First10Element(){
        int NumberOfElements=10;
        int[] resultArray={0,1,1,2,3,5,8,13,21,34};
        int[] result= C06P03_Find_First_N_Elements_Of_Fibonacci_Series_Using_Recursion.FirstNElements(NumberOfElements);
        assertArrayEquals(resultArray, result);
    }
}
