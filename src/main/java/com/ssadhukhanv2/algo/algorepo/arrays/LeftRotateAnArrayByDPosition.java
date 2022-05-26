package com.ssadhukhanv2.algo.algorepo.arrays;

/**
 * @author Subhrajit Sadhukhan
 */
public class LeftRotateAnArrayByDPosition {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int d = 2;
//        leftRotateNative(arr,d);
        leftRotate(arr, d);
        for (int n : arr) {
            System.out.print(n + " ");
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


    public static void leftRotateNative(int[] arr, int d) {

        //Complexity O(n+d)
        //Auxilary Space O(d)

        int n = arr.length;
        int[] tempArr = new int[d];

        //copy the first d elements into temp array
        for (int i = 0; i < d; i++) {
            tempArr[i] = arr[i];
        }
        //shift the elements non-copied elements to the first of the array
        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }

        //insert the elements from the temp array to the actual array
        for (int i = 0; i < d; i++) {
            arr[i + d - 1] = tempArr[i];
        }
    }
}
