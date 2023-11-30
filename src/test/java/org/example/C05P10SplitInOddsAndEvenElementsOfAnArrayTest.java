package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class C05P10SplitInOddsAndEvenElementsOfAnArrayTest {
    @Test
    public void fiveElements(){
        C05P10SplitInOddsAndEvenElementsOfAnArray obj=new C05P10SplitInOddsAndEvenElementsOfAnArray();
        int[] myArray=new int[5];
        myArray[0]=25;
        myArray[1]=47;
        myArray[2]=42;
        myArray[3]=56;
        myArray[4]=32;
        int[][] result =obj.OddsAndEven(myArray);
        assertArrayEquals(result, new int[][] {{42,56,32},{25,47,0}});
    }
}
