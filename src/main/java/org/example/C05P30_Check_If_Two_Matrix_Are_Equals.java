package org.example;

public class C05P30_Check_If_Two_Matrix_Are_Equals {
    public static boolean Check_Two_Matrix(int[][] FirstMatrix, int[][] SecondMatrix){
        for(int i=0;i< FirstMatrix[0].length; i++){
            for(int j=0; j< FirstMatrix.length; j++){
                if(FirstMatrix[i][j]!=SecondMatrix[i][j]){
                    return false;
                }
                else {
                    return true;
                }
            }
        }
        return true;
    }
}
