package org.example;
import java.util.Arrays;

public class C05P07MergeAndSortDescendingTwoArray {
    public int[] MergeAndSort(int [] FirstArray, int [] SecondArray) {
        int lengthArray= FirstArray.length+SecondArray.length;
        int [] myArray=new int[lengthArray];
        int i=0;
        int j=0;
        int k=0;
        while (i< FirstArray.length) {
            myArray[k]=FirstArray[i];
            i++;
            k++;
        }
        while (j< SecondArray.length) {
            myArray[k]=SecondArray[j];
            j++;
            k++;
        }
        Arrays.sort(myArray);
        for( int n=0; n<lengthArray/2; n++) {
            int temp=myArray[n];
            myArray[n]=myArray[lengthArray-n-1];
            myArray[lengthArray-n-1]=temp;
        }
        return myArray;
    }
}