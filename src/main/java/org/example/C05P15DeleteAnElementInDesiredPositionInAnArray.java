package org.example;

public class C05P15DeleteAnElementInDesiredPositionInAnArray {
    public static int[] DeleteAnElement(int[] myArray, int elementToBeDeleted, int positionToDeleteAnElement){
        int LengthOfResultArray= myArray.length-1;
        int[] resultArray=new int[LengthOfResultArray];
        for(int i=0;i<LengthOfResultArray;i++) {
            if(i<positionToDeleteAnElement)
                resultArray[i]=myArray[i];
            else if (i>=positionToDeleteAnElement)
                resultArray[i]=myArray[i+1];
        }
        return resultArray;
    }

}
