package com.ssadhukhanv2.algo.algorepo.arrays;

/**
 * @author Subhrajit Sadhukhan
 */
public class RemoveDuplicatesFromASortedArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5};
        int distinctCount = removeDuplicatesAndReturnDistinctCount(arr);
        for (int i = 0; i < distinctCount; i++) {
            System.out.println(arr[i]);
        }

    }

    public static int removeDuplicatesAndReturnDistinctCount(int[] arr) {
        //Time Complexity=O(n)
        int distinctCount = 0;
        arr[0] = arr[distinctCount];
        distinctCount++;
        for (int i = 1; i < arr.length; i++) {
            if (arr[distinctCount - 1] != arr[i]) {
                arr[distinctCount] = arr[i];
                distinctCount++;
            }
        }
        return distinctCount;

    }

    public static int removeDuplicatesAndReturnDistinctCountNaive(int[] arr) {
        // O(n)
        // Auxiliary space of O(n)
        int distinctCount = 0;
        int[] temp = new int[arr.length];
        temp[0] = arr[0];
        distinctCount++;
        for (int i = 1; i < arr.length; i++) {
            if (temp[distinctCount - 1] != arr[i]) {
                temp[distinctCount] = arr[i];
                distinctCount++;
            }
        }
        for (int i = 0; i < distinctCount; i++) {
            arr[i] = temp[i];
        }
        return distinctCount;

    }
}
