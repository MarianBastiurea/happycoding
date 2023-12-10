package org.example;

public class C05P23_Sum_Of_Right_Diagonal_In_Matrix {
    public static int Sum_Of_Diagonal(int[][] myMatrix){
        int sum=0;
        for (int i=0; i< myMatrix[0].length;i++){
            for(int j=0;j<myMatrix.length;j++){
                if (i==j){
                    sum=sum+myMatrix[i][j];
                }
            }
        }
        return sum;
    }
}
