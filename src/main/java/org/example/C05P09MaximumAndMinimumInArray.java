package org.example;

public class C05P09MaximumAndMinimumInArray {
    public int[] MaximumAndMinimum(int[] myArray){
        int[] resultArray =new int[2];
        int max=myArray[0];
        int min=myArray[0];
        for (int i=0; i< myArray.length;i++){
                max=Math.max(max,myArray[i]);
            }
        for (int j=0; j< myArray.length;j++){
            min=Math.min(min,myArray[j]);
        }
        resultArray[0]=max;
        resultArray[1]=min;
        return resultArray  ;
    }
}
