package org.example.c03arrays.insert;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StoreElementsInArrayTest {
    @Test
    public void given0AsNumberShouldBeAnArrayWithFirst10Integers(){
        int number=0;
        int[] myArray={0,1,2,3,4,5,6,7,8,9};
        int[] result=StoreElementsInArray.storeElements(number);
        assertArrayEquals(result,myArray);
    }
}
