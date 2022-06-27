package com.ssadhukhanv2.algo.algorepo.arrays;

import java.util.Arrays;

/**
 * @author Subhrajit Sadhukhan
 */


public class MaximumDifferenceWithinAnArray {


    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 10, 6, 4, 8, 1};
//        Arrays.sort(arr);
        int result = maxDiff(arr);
        System.out.println(result);
    }

    //actual
//    public static int maxDifference(int[] arr) {
//        int n = arr.length;
//        int min = arr[0];
//        int diff=arr[1]-arr[0];
//        for (int i = 1; i < n; i++) {
//            min=Math.min(arr[i],min);
//            diff=Math.max(diff,arr[i]-min);
//        }
//        return diff;
//    }


    public static int maxDiff(int[] arr) {
        int n = arr.length;
        int min = Math.min(arr[0], arr[1]);
        int max = Math.max(arr[0], arr[1]);

        for (int i = 2; i < n; i++) {
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }
        return max - min;
    }


    //2, 3, 10, 6, 4, 8, 1
    public static int maxDifference(int[] arr) {
        // Complexity O(n)
        int n = arr.length;
        int min = arr[0];
        int diff = arr[1] - arr[0];
        for (int i = 0; i < n; i++) {
            min = Math.min(arr[i], min);
            diff = Math.max(diff, arr[i] - min);
        }
        return diff;
    }

    public static int maxDifferenceWithinAnArrayNaive(int[] arr) {
        // Complexity O(n)
        int diff = arr[1] - arr[0];
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                diff = Math.max(diff, arr[j] - arr[i]);
            }
        }
        return diff;
    }
}
