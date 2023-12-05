package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class C05P14InsertAnewElementInaPositionInArrayTest {
    @Test
    public void FourElements(){
        int[] myArray={1,8,7,10};
        int elementToBeInserted=5;
        int positionToInsertNewElement=1;
        int[] result=C05P14InsertAnewElementInaPositionInArray.InsertElement(myArray, elementToBeInserted,positionToInsertNewElement);
        assertArrayEquals(new int[] {1,5,8,7,10},result);
    }
    @Test
    public void OneElements(){
        int[] myArray={1};
        int elementToBeInserted=5;
        int positionToInsertNewElement=1;
        int[] result=C05P14InsertAnewElementInaPositionInArray.InsertElement(myArray, elementToBeInserted,positionToInsertNewElement);
        assertArrayEquals(new int[] {1,5},result);
    }
    @Test
    public void NoElements(){
        int[] myArray={};
        int elementToBeInserted=5;
        int positionToInsertNewElement=0;
        int[] result=C05P14InsertAnewElementInaPositionInArray.InsertElement(myArray, elementToBeInserted,positionToInsertNewElement);
        assertArrayEquals(new int[] {5},result);
    }
}
