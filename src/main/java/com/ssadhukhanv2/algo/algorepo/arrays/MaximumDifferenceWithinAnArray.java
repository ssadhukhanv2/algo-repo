package com.ssadhukhanv2.algo.algorepo.arrays;

/**
 * @author Subhrajit Sadhukhan
 */


public class MaximumDifferenceWithinAnArray {

    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 10, 6, 4, 8, 1};
        int result = maxDifference(arr);
        System.out.println(result);
    }

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
