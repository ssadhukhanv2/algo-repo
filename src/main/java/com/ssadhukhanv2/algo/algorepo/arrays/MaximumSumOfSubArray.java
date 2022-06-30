package com.ssadhukhanv2.algo.algorepo.arrays;

/**
 * @author Subhrajit Sadhukhan
 */
public class MaximumSumOfSubArray {
    public static void main(String[] args) {


        int[] arr1 = new int[]{1, -2, 3, -1, 2};
        System.out.println(findMaxSubArraySum(arr1));


        int[] arr2 = new int[]{-3, 8, -2, 4, -5, 6};
        System.out.println(findMaxSubArraySum(arr2));

    }


    public static int findMaxSubArraySum(int[] arr) {
        //Kadanes Algorithm
        //Time complexity O(n)
        int n = arr.length;
        int res = arr[0];
        int maxEnding = arr[0];
        for (int i = 1; i < n; i++) {
            maxEnding = Math.max(arr[i], maxEnding + arr[i]);
            res = Math.max(res, maxEnding);
        }
        return res;
    }


    public static int getFindMaxSubArraySumNaive(int[] arr) {
        // Time Complexity O(n^2)
        int n = arr.length;
        int res = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int curr = 0;
            for (int j = i; j < arr.length; j++) {
                curr = curr + arr[j];
                res = Math.max(curr, res);
            }
        }
        return res;
    }


//    public static int findMaxSumNaive(int arr[]) {
//        int n = arr.length;
//        int res = arr[0];
//        for (int i = 0; i < n; i++) {
//            int curr = 0;
//            for (int j = i; j < n; j++) {
//                curr = curr + arr[j];
//                res = Math.max(curr, res);
//            }
//        }
//        return res;
//    }
}
