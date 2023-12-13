package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
public class C05P32_Find_pair_Of_Elements_Of_An_Array_With_Given_Sum_Test {
    @Test
    public void SevenElements(){
        int[] myArray={6,8,4,-5,7,9,11};
        int sum=15;
        int[][] pair={{6,9},{8,7},{4,11}};
        int[][] result= C05P32_Find_pair_Of_Elements_Of_An_Array_With_Given_Sum.FindPair(myArray, sum);
        assertArrayEquals(pair,result);
    }
    @Test
    public void sixElements(){
        int[] myArray={15,5,20,0,25,-5};
        int sum=20;
        int[][] pair={{15,5},{20,0},{25,-5}};
        int[][] result= C05P32_Find_pair_Of_Elements_Of_An_Array_With_Given_Sum.FindPair(myArray, sum);
        assertArrayEquals(pair,result);
    }
    @Test
    public void NoPairs(){
        int[] myArray={15,5,20,0,25,-5};
        int sum=7;
        int[][] pair=new int [0][0];
        int[][] result= C05P32_Find_pair_Of_Elements_Of_An_Array_With_Given_Sum.FindPair(myArray, sum);
        assertArrayEquals(pair,result);
    }
}


