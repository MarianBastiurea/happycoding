package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class C05P13InsertANewElementInArrayTest {
    @Test
    public void FiveElements(){
        C05P13InsertANewElementInArray obj=new C05P13InsertANewElementInArray();
        int[] myArray=new int[5];
        myArray[0]=2;
        myArray[1]=5;
        myArray[2]=7;
        myArray[3]=9;
        myArray[4]=11;
        int[] result=obj.InsertElements(myArray);
        assertArrayEquals(result, new int[] {2,5,7,8,9,11});
    }
}
