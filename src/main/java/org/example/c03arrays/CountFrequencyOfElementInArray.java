package org.example.c03arrays;

/*
Write a program in Java to count the frequency of each element of an array.
 */
public class CountFrequencyOfElementInArray {
    public int[] FrequencyElement(int[] myArray) {
        int[] FrequencyArray = new int[3];
        for (int i = 0; i < myArray.length; i++) {
            int index = 0;
            for (int j = 0; j < myArray.length; j++) {
                if (myArray[i] == myArray[j]) {
                    index = index + 1;
                }
                FrequencyArray[i] = index;
            }
        }
        return FrequencyArray;
    }
}
