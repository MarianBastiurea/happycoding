package org.example;

public class C05P08FrequencyElementInArray {
    public int[] FrequencyElement(int[] myArray) {
        int[] FrequencyArray = new int[3];
        for (int i=0; i< myArray.length; i++) {
            int index=0;
            for (int j=0; j< myArray.length; j++) {
                if (myArray[i]==myArray[j]) {
                    index=index+1;
                }
                FrequencyArray[i]=index;
            }
        }
        return FrequencyArray;
    }
}
