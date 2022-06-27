package com.ssadhukhanv2.algo.algorepo.arrays;

/**
 * @author Subhrajit Sadhukhan
 */
public class MoveZerosToEnd {


    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 0, 3, 0, 3, 4, 0, 0, 5, 0, 5};
        practiceMoveZerosToTheEnd(arr);
//        moveZerosToEnd(arr);
        for (int n : arr) {
            System.out.println(n + " ");
        }
    }


    public static int practiceMoveZerosToTheEnd(int[] arr) {
        int nonZeroSize=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                practiceSwap(arr,i,nonZeroSize);
                nonZeroSize++;
            }
        }
        return nonZeroSize;
    }

    public static void practiceSwap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void moveZerosToEnd(int[] arr) {
        int nonZeroCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                swap(arr, i, nonZeroCount);
                nonZeroCount++;
            }
        }


    }

    public static void moveZerosToEndNaive(int[] arr) {
        // Complexity O(Math.pow(n,2))
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] != 0) {
                        swap(arr, i, j);
                        break;
                    }
                }
            }

        }
    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}
