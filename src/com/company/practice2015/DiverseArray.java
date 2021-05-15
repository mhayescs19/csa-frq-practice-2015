package com.company.practice2015;

import java.util.Arrays;

public class DiverseArray {

    // (a)
    static int arraySum(int[] arr) {
        int sum = 0;

        for (int value : arr) { // cycles through each value in a given row; for-each loop gets each index in the 1D array
            sum += value;
        }

        return sum;
    }

    // (b)
    static int[] rowSums(int[][] arr2D) {
        int index = 0;
        int[] rowSum = new int[arr2D[0].length-1]; // array to store the sums of each row in the 2D array
        for (int[] row : arr2D) {
            rowSum[index] = arraySum(row); // same for-each, gets each row in the 2D array, then sums it
            index++;
        }

        return rowSum;
    }

    // (c)
    static boolean isDiverse(int[][] arr2D) {
         boolean isDiverse = true;

         int[] rowSums = rowSums(arr2D); // creates an array with each row sum in each index, length = # of rows

         for (int i = 0; i < rowSums.length; i++) {
             int current = rowSums[i];
             for (int j = 0; j < rowSums.length; j++) {
                 if (current == rowSums[j] && i != j) { // if two unique row sums are the same, then it fails the requirement of a diverse 2D array -> return false
                     return false;
                 }
             }
         }

         return isDiverse;
    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {
                    1,3,2,7,3
                },
                {
                    10, 10,4,6,2
                },
                {
                    5,3,5,9,6
                },
                {
                        1,3,2,7,3//7,6,4,2,1
                }
        };
        System.out.println(Arrays.toString(rowSums(arr)));
        System.out.println(isDiverse(arr));
    }
}
