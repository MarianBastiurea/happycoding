package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class C05P14InsertAnewElementInaPositionInArrayTest {
    @Test
    public void FourElements(){
        C05P14InsertAnewElementInaPositionInArray obj=new C05P14InsertAnewElementInaPositionInArray();
        int[] myArray=new int[4];
        myArray[0]=1;
        myArray[1]=8;
        myArray[2]=7;
        myArray[3]=10;
        int[] result=obj.InsertElement(myArray);
        assertArrayEquals(result,new int[] {1,5,8,7,10});
    }
}
