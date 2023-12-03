package org.example;

public class C5P06FindAllUniqueElementsInArray {
    public static int[] uniqueElement(int[] myArray) {
        int[] allUniqueElements = new int[2];
        int indexAllUniqueElements = 0;
        int len = myArray.length;
        for (int i = 0; i < len; i++) {
            int b = 0;
            for (int j = 0; j < len; j++) {
                if (myArray[i] == myArray[j] && i != j) {
                    b = 1;
                    break;
                }
            }
            if (b == 0) {
                allUniqueElements[indexAllUniqueElements] = myArray[i];
                indexAllUniqueElements++;
            }
        }
        return allUniqueElements;
    }
}
