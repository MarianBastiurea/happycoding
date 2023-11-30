package org.example;

public class C05P10SplitInOddsAndEvenElementsOfAnArray {
    public int[][] OddsAndEven(int[] myArray){
        int[][] OddsAndEvenArray=new int[2][3];
        int j=0;
        int k=0;
        for(int i=0;i< myArray.length; i++) {
            if (myArray[i]%2==0){
                OddsAndEvenArray[0][j]=myArray[i];
                j++;
            } else {
                OddsAndEvenArray[1][k]=myArray[i];
                k++;
            }
        }
        return OddsAndEvenArray;
    }
}
