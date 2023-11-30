package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class C05P09MaximumAndMinimumInArrayTest {
    @Test
    public void ThreeElements(){
        C05P09MaximumAndMinimumInArray obj = new C05P09MaximumAndMinimumInArray();
        int[] myArray= new int[3];
        myArray[0]=45;
        myArray[1]=25;
        myArray[2]=21;
        int[] result =obj.MaximumAndMinimum(myArray);
        assertArrayEquals(result,new int[] {45,21});
    }
}
