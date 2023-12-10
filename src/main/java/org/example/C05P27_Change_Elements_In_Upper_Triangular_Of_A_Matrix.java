package org.example;

public class C05P27_Change_Elements_In_Upper_Triangular_Of_A_Matrix {
    public static int[][] Change_Elements(int[][] myMatrix){
        int[][] Matrix_With_Element_Changed=new int[myMatrix[0].length][myMatrix.length];
        for (int i = 0; i <myMatrix[0].length; i++) {
            for (int j = 0; j <myMatrix.length; j++) {
                if(i== myMatrix[0].length-1){
                    Matrix_With_Element_Changed[i][j] = myMatrix[i][j];}
                if(j>i) {
                    Matrix_With_Element_Changed[i][j] = 0;
                }
                else{
                    Matrix_With_Element_Changed[i][j] = myMatrix[i][j];
                }
            }
        }
        return Matrix_With_Element_Changed;


    }
}
