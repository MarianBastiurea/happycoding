package org.example;

public class C07P01_Find_Maximum_In_An_Array_Using_Selection_Sort_Algorithm {
    public static int FindMaximumInArray(int[] myArray){
        int max=0;
        for(int i=1;i< myArray.length-1;i++){
                if(myArray[i]>myArray[max]){
                    max= i;
                }
            }
        int maximum=myArray[max];
       return maximum;
    }
}
