package org.example;

public class C05P44_Find_Two_Repeating_Elements_In_An_Array {
    public static int[] FindTwo(int[] myArray) {
        int[] resultArray = new int[2];
        int k = 0;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i] == myArray[j]) {
                    resultArray[k] = myArray[i];
                    k++;
                    if (k == 2) {
                        i = myArray.length;
                        j = myArray.length;
                    }
                    break;
                }
            }
        }
        return resultArray;
    }
}
