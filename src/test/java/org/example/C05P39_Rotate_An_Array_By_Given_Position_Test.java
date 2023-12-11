package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class C05P39_Rotate_An_Array_By_Given_Position_Test {
    @Test
    public void ElevenElements(){
        int[] myArray={0,3,6,9,12,14,18,20,22,25,27};
        int[] resultArray={12,14,18,20,22,25,27,0,3,6,9};
        int position=4;
        int[] result=C05P39_Rotate_An_Array_By_Given_Position.RotateArray(myArray,position);
        assertArrayEquals(resultArray, result);
    }
    @Test
    public void ThreeElements(){
        int[] myArray={0,3,6};
        int[] resultArray={3,6,0};
        int position=1;
        int[] result=C05P39_Rotate_An_Array_By_Given_Position.RotateArray(myArray,position);
        assertArrayEquals(resultArray, result);
    }
}
