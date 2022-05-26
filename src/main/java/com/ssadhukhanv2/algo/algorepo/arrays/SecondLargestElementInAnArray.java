package com.ssadhukhanv2.algo.algorepo.arrays;

/**
 * @author Subhrajit Sadhukhan
 */
public class SecondLargestElementInAnArray {


    public static void main(String[] args) {
        int[] arr1 = new int[]{3, 4, 9, 8, 7, 9, 9};
        System.out.println("Second Largest: " + getSecondLargest(arr1));
    }



    public static int getSecondLargest(int[] arr) {
        int largest = 0;
        int secondLargest = -1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[largest]) {
                secondLargest = largest;
                largest = i;
            } else if (arr[i] != arr[largest] && arr[i] > arr[secondLargest]) {
                secondLargest = i;
            }
        }
        return secondLargest;
    }
}
