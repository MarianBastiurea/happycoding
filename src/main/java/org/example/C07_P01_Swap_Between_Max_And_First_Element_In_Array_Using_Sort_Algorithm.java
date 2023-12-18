package org.example;

public class C07_P01_Swap_Between_Max_And_First_Element_In_Array_Using_Sort_Algorithm {
    public static int[] SwapBetweenMax(int[] myArray){
        int temp=0;
        int max=0;
        for(int i=1;i< myArray.length-1;i++) {
                if (myArray[max] < myArray[i]) {
                    max=i;
                }
            }

        int maximum=myArray[max];
        for (int i=0; i<myArray.length-1; i++){
            if(myArray[i]==maximum){
                temp=myArray[0];
                myArray[0]=myArray[i];
                myArray[i]=temp;
            }
        }
        return myArray;
    }
}
