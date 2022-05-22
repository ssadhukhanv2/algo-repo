package com.ssadhukhanv2.algo.algorepo.arrays;

import java.util.Arrays;

/**
 * @author Subhrajit Sadhukhan
 */
public class BasicArrayOperations {
    public static void main(String[] args) {
        int[] arr1 = new int[]{3, 4, 9, 8, 7, 9, 9};
        System.out.println("Largest Element Index: " + getLargest(arr1));
        System.out.println("Second Largest Element Index: " + getSecondLargest(arr1));

        int[] arr2 = new int[]{1, 2, 3, 4, 5, 6, 7};
        System.out.println(checkSorted(arr2));
        System.out.println(checkSorted(arr1));

        reverse(arr2);
        Arrays.stream(arr2).mapToObj(n -> " " + n).forEach(System.out::print);

    }

    public static void reverse(int arr[]) {
        int low = 0;
        int high = arr.length - 1;
        while (high > low) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }

    public static boolean checkSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                return false;
            }
        }
        return true;
    }

    public static int getSecondLargest(int[] arr) {
        // Time Complexity O(n)
        int largestIndex = 0;
        int res = -1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[largestIndex]) {
                res = largestIndex;
                largestIndex = i;
            } else if (arr[largestIndex] != arr[i]) {
                if (res == -1 || arr[i] > arr[res]) {
                    res = i;
                }
            }
        }
        return res;
    }

    public static int getSecondLargestNative(int[] arr) {
        // Time Complexity O(2n)
        int maxIndex = getLargest(arr);
        int secondMaxIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[maxIndex]) {
                if (secondMaxIndex == -1) {
                    secondMaxIndex = i;
                } else if (arr[i] > arr[secondMaxIndex]) {
                    secondMaxIndex = i;
                }
            }

        }
        return secondMaxIndex;
    }

    public static int getLargest(int[] arr) {
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
