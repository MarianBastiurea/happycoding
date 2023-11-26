package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class C5P06FindAllUniqueElementsTest {
    @Test
    public void numeTest() {
        C5P06FindAllUniqueElements obj=new C5P06FindAllUniqueElements();
        int[] myArray=new int[4];
        myArray[0]=3;
        myArray[1]=2;
        myArray[2]=2;
        myArray[3]=5;
        int[] result =obj.uniqueElement(myArray);
        assertArrayEquals(result,new int[] {3,5});
    }
}
