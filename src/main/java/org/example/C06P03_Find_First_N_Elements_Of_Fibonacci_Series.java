package org.example;

public class C06P03_Find_First_N_Elements_Of_Fibonacci_Series {

    public static int[] FirstNElements(int NumberOfElements){
        int[] myArray= new int[NumberOfElements];
        myArray[0]=0;
        myArray[1]=1;
        AddFirstNElements(myArray,2);
        return myArray;
    }
    public static void AddFirstNElements(int[] myArray,int index){
        if(index< myArray.length&&index>=2){
            myArray[index]=myArray[index-2]+myArray[index-1];
            AddFirstNElements(myArray, index+1);
        }
    }
}
