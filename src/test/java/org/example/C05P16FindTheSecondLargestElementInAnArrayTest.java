package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class C05P16FindTheSecondLargestElementInAnArrayTest {
    @Test
    public void FiveElements(){
        C05P16FindTheSecondLargestElementInAnArray obj=new C05P16FindTheSecondLargestElementInAnArray();
        int[] myArray=new int[5];
        myArray[0]=2;
        myArray[1]=9;
        myArray[2]=1;
        myArray[3]=4;
        myArray[4]=6;
        int[] result=obj.FindSecondLargestElementInArray(myArray);
        assertArrayEquals(result,new int[] {6});
    }
}
