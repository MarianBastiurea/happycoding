package org.example;

public class C05P15DeleteAnElementInDesiredPositionInAnArray {
    public int[] DeleteAnElement(int[] myArray){
        int LengthOfResultArray=4;
        int elementToBeDeleted=3;
        int positionToDeleteAnElement=2;
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
