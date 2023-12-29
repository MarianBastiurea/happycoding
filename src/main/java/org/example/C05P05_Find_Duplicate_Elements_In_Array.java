package org.example;


/* Write a program in Java to count the total number of duplicate elements in an array.

https://www.w3resource.com/c-programming-exercises/array/c-array-exercise-5.php
 */

public class C05P05_Find_Duplicate_Elements_In_Array {

    public static int FindDuplicate (int[] myArray) {
        int count=0;
        for(int i=0; i< myArray.length;++i) {
            for (int j = i+1; j <  myArray.length; ++j) {
                if (myArray[i] == myArray[j]) {
                    count++;
                }
            }
        }
        if(count> myArray.length){
            count= myArray.length;
        }
        return count;
    }
}