package com.ssadhukhanv2.algo.algorepo.arrays;

/**
 * @author Subhrajit Sadhukhan
 */
public class PrintFrequencyInSortedArray {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 2, 3, 3, 3, 4, 4, 5};
        printFrequency(arr);
    }



    public static void printFrequencySortedArray(int[] arr){
        int i=0;
        int n=arr.length;
        while (i<n){

        }

    }














    public static void printFrequency(int[] arr) {
        // Complexity O(n)
        int frequency = 1;
        int i = 1;
        int n = arr.length;
        while (i < n) {
            while (i < n && arr[i - 1] == arr[i]) {
                frequency++;
                i++;
            }
            System.out.println(arr[i - 1] + " " + frequency);
            frequency = 1;
            i++;
        }
        if (n == 1 || arr[n - 1] != arr[n - 2]) {
            System.out.println(arr[n - 1] + " " + 1);
        }
    }
}
