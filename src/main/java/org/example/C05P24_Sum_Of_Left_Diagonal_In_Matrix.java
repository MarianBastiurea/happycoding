package org.example;

public class C05P24_Sum_Of_Left_Diagonal_In_Matrix {
    public static int[] Sum_Of_Diagonal(int[][] myMatrix){
        int[] sum={0};
        int decrement= myMatrix.length-1;
        for (int i=0;i<myMatrix[0].length;i++){
            for(int j=myMatrix.length-1;j>=0;j--){
                if(j==decrement) {
                    sum[0] = sum[0] + myMatrix[i][j];
                }
            }
            decrement=decrement-1;
        }
        return sum;
    }

}
