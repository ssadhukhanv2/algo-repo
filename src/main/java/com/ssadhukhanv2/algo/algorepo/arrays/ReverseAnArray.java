package com.ssadhukhanv2.algo.algorepo.arrays;

import java.util.Arrays;

/**
 * @author Subhrajit Sadhukhan
 */
public class ReverseAnArray {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1, 2, 3, 4, 4, 5, 6, 78, 9};
        reverse(arr);
        Arrays.asList(arr).forEach(System.out::println);
    }

    public static void reverse(Integer[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
