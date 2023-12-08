package org.example;

public class C05P20SubstractOfTwoMatrices {
    public static int[][] SubstractOftwoMatrices(int[][] FirstMatrices, int[][] SecondMatrices) {
        int rows, columns;
        if(FirstMatrices.length> SecondMatrices.length){
            columns= FirstMatrices.length;
        } else {columns= SecondMatrices.length;

        }
        if(FirstMatrices[0].length> SecondMatrices[0].length){
            rows= FirstMatrices[0].length;
        } else {rows= SecondMatrices[0].length;

        }
        int[][] ResultMatrice=new int[columns][rows];

        for(int i=0; i< columns;i++){
            for(int j=0; j< rows; j++){
                ResultMatrice[i][j]=FirstMatrices[i][j]-SecondMatrices[i][j];
            }
        }
return ResultMatrice;
    }
}
