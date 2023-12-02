package org.example;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class C05P15DeleteAnElementInDesiredPositionInAnArrayTest {
    @Test
    public  void FiveElements(){
        C05P15DeleteAnElementInDesiredPositionInAnArray   obj=new  C05P15DeleteAnElementInDesiredPositionInAnArray();
        int[] myArray=new int[5];
        myArray[0]=1;
        myArray[1]=2;
        myArray[2]=3;
        myArray[3]=4;
        myArray[4]=5;
        int[] result=obj.DeleteAnElement(myArray);
        assertArrayEquals(result,new int[] {1,2,4,5});
    }
}
