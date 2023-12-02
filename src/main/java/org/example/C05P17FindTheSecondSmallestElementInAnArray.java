package org.example;

public class C05P17FindTheSecondSmallestElementInAnArray {
    public int[] SecondSmallestElementInAnArray(int[] myArray){
        int[] resultArray=new int[1];
        int temp;
        for (int i=0;i<4;i++) {
            if (myArray[i] > myArray[i + 1]) {
                temp = myArray[i + 1];
                myArray[i + 1] = myArray[i];
                myArray[i] = temp;
            }
        }
        resultArray[0]=myArray[1];
        return resultArray;
    }
}
