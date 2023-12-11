package org.example;

public class C05P39_Rotate_An_Array_By_Given_Position {
    public static int[] RotateArray(int[] myArray, int position){
        int[] resultArray=new int[myArray.length];
        for(int i=0; i< myArray.length; i++) {
            if (i < position) {
                resultArray[myArray.length - position + i] = myArray[i];
            } else {
                resultArray[i-position] = myArray[i];
            }
        }
        return resultArray;
            }
}
