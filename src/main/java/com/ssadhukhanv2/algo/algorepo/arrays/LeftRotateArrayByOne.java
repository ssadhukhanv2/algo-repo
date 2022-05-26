package com.ssadhukhanv2.algo.algorepo.arrays;

/**
 * @author Subhrajit Sadhukhan
 */
public class LeftRotateArrayByOne {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 0, 3, 0, 3, 4, 0, 0, 5, 0, 5};
        leftRotateByOne(arr);
        for (int n : arr) {
            System.out.println(n + " ");
        }
    }

    public static void leftRotateByOne(int[] arr) {
        int n = arr.length;
        int temp = arr[0];
        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }
        arr[n - 1] = temp;
    }
}
