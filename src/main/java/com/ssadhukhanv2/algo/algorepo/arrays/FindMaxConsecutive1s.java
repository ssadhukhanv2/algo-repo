package com.ssadhukhanv2.algo.algorepo.arrays;

/**
 * @author Subhrajit Sadhukhan
 */
public class FindMaxConsecutive1s {
    public static void main(String[] args) {
        int[] arr1 = new int[]{0, 1, 1, 0, 1, 0};
        int[] arr2 = new int[]{1, 1, 1, 1};
        int[] arr3 = new int[]{0, 0, 0};
        int[] arr4 = new int[]{1, 0, 1, 1, 1, 1, 0, 1, 1};


        System.out.println(findMaxConsecutive1s(arr1));
        System.out.println(findMaxConsecutive1s(arr2));
        System.out.println(findMaxConsecutive1s(arr3));
        System.out.println(findMaxConsecutive1s(arr4));

    }

    public static int findMaxConsecutive1s(int[] arr) {
        // Time Complexity O(n)
        // Auxiliary Space O(1)
        int n = arr.length;
        int result = 0;
        int curr = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                curr++;
            } else {
                if (curr > result) {
                    result = curr;
                }
                curr = 0;
            }
        }
        if (curr > result) {
            result = curr;
        }
        return result;
    }


    public static int findMaxConsecutive1sNaive(int[] arr) {
        // Time Complexity O(n^2)

        int n = arr.length;
        int result = 0;
        for (int i = 0; i < n; i++) {
            int curr = 0;
            for (int j = i; j < n; j++) {
                if (arr[j] == 0) {
                    break;
                }
                curr++;
            }
            if (curr > result) {
                result = curr;
            }
        }
        return result;
    }
}
