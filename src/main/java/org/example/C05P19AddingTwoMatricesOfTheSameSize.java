package org.example;

public class C05P19AddingTwoMatricesOfTheSameSize {
    public static int[][] AddingTwoMatrices(int[][] FirstMatrices, int[][] SecondMatrices){
        int[][] AddTwoMatrices=new int[FirstMatrices.length][FirstMatrices.length];
        for(int i=0; i<2;i++){
            for(int j=0; j<2; j++){
                AddTwoMatrices[i][j]=FirstMatrices[i][j]+SecondMatrices[i][j];
            }
        }
        return AddTwoMatrices;
    }
}
