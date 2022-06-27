package com.ssadhukhanv2.algo.algorepo.arrays;

/**
 * @author Subhrajit Sadhukhan
 */
public class TrappingRainWater {

    public static void main(String[] args) {
        int[] arr = new int[]{3, 0, 1, 2, 5};

        System.out.println(getTrappedWater(arr));
    }

    public static int getTrappedWater(int[] arr) {
        //Time Complexity O(3n) = O(n)
        int n = arr.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        leftMax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(arr[i], leftMax[i - 1]);
        }
        rightMax[n - 1] = arr[n - 1];
        for (int i = n - 2; i > 0; i--) {
            rightMax[i] = Math.max(arr[i], rightMax[i + 1]);
        }
        int rainWater = 0;
        for (int i = 1; i < n - 1; i++) {
            rainWater += Math.min(leftMax[i], rightMax[i]) - arr[i];
        }
        return rainWater;
    }


    public static int getTrappedWaterNaive(int[] arr) {
        //Time Complexity O(n^2)
        int n = arr.length;
        int finalQty = 0;
        for (int i = 1; i < n - 1; i++) {
            int lmax = findMax(arr, 0, i - 1);
            int rMax = findMax(arr, i + 1, n - 1);
            finalQty += (Math.min(lmax, rMax) - arr[i]);
        }
        return finalQty;
    }


    public static int findMax(int[] arr, int startIndex, int endIndex) {
        if (startIndex == endIndex) {
            return arr[startIndex];
        }
        int max = arr[startIndex];
        for (int i = startIndex + 1; i <= endIndex; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }

}
