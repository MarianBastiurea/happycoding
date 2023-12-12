package org.example;

public class C05P50_Transform_A_Matrix_Using_Spiral_Path_In_Array {
    public static int[] TransformAMatrix(int[][] myMatrix){
        int[] Result= new int[myMatrix.length* myMatrix[0].length];
        int ICountUp = 0;
        int ICountDown = 0;
        int JCountLeft = 0;
        int JCountRight = 0;
        int k = 0;
        int rows = myMatrix.length;
        int columns = myMatrix[0].length;
        // int[] Result = new int[14];
        while (k < Result.length) {
            for (int j = JCountLeft; j < columns - JCountRight; j++) {
                Result[k] = myMatrix[ICountUp][j];
                k++;
            }
            ICountUp++;

            for (int i = ICountUp; i < rows - ICountDown; i++) {
                Result[k] = myMatrix[i][columns - JCountRight - 1];
                k++;
            }
            JCountRight++;

            for (int m = columns - JCountRight - 1; m >= JCountLeft; m--) {
                Result[k] = myMatrix[rows - ICountDown - 1][m];
                k++;
            }
            ICountDown++;

            for (int n = rows - ICountDown - 1; n >= ICountUp; n--) {
                Result[k] = myMatrix[n][JCountLeft];
                k++;
            }
            JCountLeft++;
        }
    return Result;
    }
}
