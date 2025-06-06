package com.marianbastiurea.c03arrays.calculate;

/*
Write a program in Java to count the frequency of each element of an array.
 */
public class FrequencyOfElementsInArray {
    private FrequencyOfElementsInArray() {
    }

    public static int[] frequencyElement(int[] myArray) {
        int[] frequencyArray = new int[3];
        for (int i = 0; i < myArray.length; i++) {
            int index = 0;
            for (int k : myArray) {
                if (myArray[i] == k) {
                    index = index + 1;
                }
                frequencyArray[i] = index;
            }
        }
        return frequencyArray;
    }
}
