package org.example;

public class C05P12SortInDescendingOrderElementsOfArray {
    public static int[] SortInDescendingOrder(int[] myArray) {
            int[] resultArray = new int[myArray.length];
            for (int i = 0; i < myArray.length; i++) {
                int max = 0;
                for (int j = 0; j < myArray.length; j++) {
                    max = Math.max(max, myArray[j]);
                }
                int x= findIndexOfMax(myArray,max);
                myArray[x] = 0;
                resultArray[i] = max;
            }
            return resultArray;
        }
        static int findIndexOfMax(int[] myArray,int max){
            int index;
            for(index=0;index< myArray.length; index++) {
                if (myArray[index] == max) {
                    return index;
                }
            }
            return index;
        }
    }

