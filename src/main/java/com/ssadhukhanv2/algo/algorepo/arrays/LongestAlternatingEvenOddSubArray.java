package com.ssadhukhanv2.algo.algorepo.arrays;

/**
 * @author Subhrajit Sadhukhan
 */
public class LongestAlternatingEvenOddSubArray {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 10, 20, 6, 3, 8};
        System.out.println(findLongestAlternatingEvenOddSubArrayEfficient(arr));
    }


    public static int findLongestAlternatingEvenOddSubArrayEfficient(int[] arr) {
        //Time Complexity O(n)
        //Modified Kadanes
        int n = arr.length;
        int res = 1;
        int curr = 1;
        for (int i = 1; i < n; i++) {
            if ((arr[i] % 2 == 0 && arr[i - 1] % 2 == 1) || (arr[i] % 2 == 1 && arr[i - 1] % 2 == 0)) {
                curr++;
                res = Math.max(res, curr);
            } else {
                curr = 1;
            }
        }
        return res;
    }


    public static int findLongestAlternatingEvenOddSubArrayNaive(int[] arr) {
        //Time Complexity O(n^2)
        int n = arr.length;
        int res = 1;
        for (int i = 0; i < n; i++) {
            int curr = 1;
            for (int j = i + 1; j < n; j++) {
                if ((arr[j] % 2 == 0 && arr[j - 1] % 2 == 1) || (arr[j] % 2 == 1 && arr[j - 1] % 2 == 0)) {
                    curr++;
                } else {
                    break;
                }
            }
            res = Math.max(curr, res);
        }
        return res;
    }
}
