package org.example;

public class C05P13InsertANewElementInArray {
    public int[] InsertElements(int[] myArray) {
        int[] resultArray=new int[6];
        int pos=3;
        for (int i=0; i<6; i++){
            if (i<pos)
                resultArray[i] = myArray[i];
             else if (i==pos)
                resultArray[i]=8;
            else
                resultArray[i] = myArray[i - 1];
        }
    return resultArray;
    }
}
