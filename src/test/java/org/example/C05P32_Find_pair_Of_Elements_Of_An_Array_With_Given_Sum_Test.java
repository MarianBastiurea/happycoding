package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
public class C05P32_Find_pair_Of_Elements_Of_An_Array_With_Given_Sum_Test {
    @Test
    public void SevenElements(){
        int[] myArray={6,8,4,-5,7,9,11};
        int sum=15;
        int[] pair={6,9};
        int[] result= C05P32_Find_pair_Of_Elements_Of_An_Array_With_Given_Sum.FindPair(myArray, sum);
        assertArrayEquals(pair,result);
    }
    @Test
    public void sixElements(){
        int[] myArray={6,8,4,-5,7,9,11};
        int sum=20;
        int[] pair={9,11};
        int[] result= C05P32_Find_pair_Of_Elements_Of_An_Array_With_Given_Sum.FindPair(myArray, sum);
        assertArrayEquals(pair,result);
    }
}
