package org.example;

public class C05P14InsertAnewElementInaPositionInArray {
    public int[] InsertElement(int[] myArray) {
        int LengthOfResultArray=5;
        int elementToBeInserted=5;
        int positionToInsertNewElement=1;
        int[] resultArray=new int[LengthOfResultArray];
        for(int i=0;i<LengthOfResultArray;i++) {
            if(i<positionToInsertNewElement)
                resultArray[i]=myArray[i];
            else if (i==positionToInsertNewElement)
                resultArray[i]=elementToBeInserted;
                else
                    resultArray[i]=myArray[i-1];
        }
        return resultArray;
    }

}
