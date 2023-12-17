package org.example;

public class C06P01_Create_An_Array_With_First_N_Natural_Numbers {


    public static int[] CreateAnArray(int start, int numberOfElements) {
        int[] array = new int[numberOfElements];
        AddElementInArray(array, 1, 0);
        return array;
    }

    public static void AddElementInArray(int[] array, int start, int index) {
        if (index < array.length) {
            array[index] = start;
            AddElementInArray(array, start + 1, index + 1);
        }
    }
}

