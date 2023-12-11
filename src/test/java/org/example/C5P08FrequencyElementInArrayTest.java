package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class C5P08FrequencyElementInArrayTest {
        @Test
        public void numeTest() {
            C05P08FrequencyElementInArray obj=new C05P08FrequencyElementInArray();
            int[] myArray=new int[3];
            myArray[0]=25;
            myArray[1]=12;
            myArray[2]=43;
            int[] result =obj.FrequencyElement(myArray);
            assertArrayEquals(result,new int[] {1,1,1});
        }
    @Test
    public void TwoElements() {
        C05P08FrequencyElementInArray obj=new C05P08FrequencyElementInArray();
        int[] myArray=new int[3];
        myArray[0]=25;
        myArray[1]=25;
        myArray[2]=43;
        int[] result =obj.FrequencyElement(myArray);
        assertArrayEquals(result,new int[] {2,2,1});
    }
}
