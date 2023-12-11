package org.example;

public class C05P32_Find_pair_Of_Elements_Of_An_Array_With_Given_Sum {
    public static int[] FindPair(int[] myArray, int sum) {
        int[] resultArray = new int[2];
        for (int i = 0; i < myArray.length; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i] + myArray[j] == sum) {
                    resultArray[0] = myArray[i];
                    resultArray[1] = myArray[j];
                    i=myArray.length;
                    j= myArray.length;
                }
            }
        }
        return resultArray;
    }
}
