package com.ssadhukhanv2.algo.algorepo.arrays;

/**
 * @author Subhrajit Sadhukhan
 */
public class LeftRotateAnArrayByDPosition {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int d = 2;
        leftRotateNaive(arr, d);
//        leftRotate(arr, d);
        for (int n : arr) {
            System.out.print(n + " ");
        }

    }


    public static void leftRotateNaive(int[] arr, int d) {
        int[] temp = new int[d];
        int n = arr.length;
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }
        for (int i = 0; i < d; i++) {
            arr[n - d + i] = temp[i];
        }
    }


    public static void leftRotate(int[] arr, int d) {
        //Complexity O(n)
        //Auxiliary Space O(1)
        int n = arr.length;
        while (d > n) {
            d = n - d;
        }
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }



}
