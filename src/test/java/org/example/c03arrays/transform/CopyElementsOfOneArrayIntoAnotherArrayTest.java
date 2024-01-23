package org.example.c03arrays.transform;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CopyElementsOfOneArrayIntoAnotherArrayTest {
    @Test
    public void copyEmptyArray(){
        int[] myArray={};
        int[] result=CopyElementsOfOneArrayIntoAnotherArray.copyElements(myArray);
        assertArrayEquals(result,myArray);
    }
    @Test
    public void copyOneElementArray(){
        int[] myArray={1};
        int[] result=CopyElementsOfOneArrayIntoAnotherArray.copyElements(myArray);
        assertArrayEquals(result,myArray);
    }
    @Test
    public void copyTenElementArray(){
        int[] myArray={0,1,2,3,4,5,6,7,8,9};
        int[] result=CopyElementsOfOneArrayIntoAnotherArray.copyElements(myArray);
        assertArrayEquals(result,myArray);
    }
}
