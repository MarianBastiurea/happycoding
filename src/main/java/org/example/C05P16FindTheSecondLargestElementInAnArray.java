package org.example;

public class C05P16FindTheSecondLargestElementInAnArray {
    public static int[] FindSecondLargestElementInArray(int[] myArray) {
        int[] resultArray = new int[1];
        int temp;
        for (int i=0;i< myArray.length-1;i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i] > myArray[j]) {
                    temp = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = temp;
                }
            }
        }
        resultArray[0]=myArray[myArray.length-2];
        return resultArray;
    }
}
