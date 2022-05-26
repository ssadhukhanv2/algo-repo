package com.ssadhukhanv2.algo.algorepo.arrays;

/**
 * @author Subhrajit Sadhukhan
 */
public class FindLeadersInAnArray {

    public static void main(String[] args) {
        int[] arr = new int[]{7, 10, 4, 10, 6, 5, 2};
        printLeadersNaive(arr);
        System.out.println();
        printLeaders(arr);
    }

    public static void printLeaders(int[] arr) {
        //Complexity O(n)
        int n = arr.length;
        int leader = n - 1;
        System.out.print(arr[leader] + " ");
        for (int i = n - 2; i > 0; i--) {
            if (arr[i] > arr[leader]) {
                leader = i;
                System.out.print(arr[leader] + " ");
            }
        }
    }

    public static void printLeadersNaive(int[] arr) {
        //Complexity O(n*n)
        //All elements which has only small elements on the right are leaders
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            boolean leader = true;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] >= arr[i]) {
                    leader = false;
                    break;
                }
            }
            if (leader) {
                System.out.print(arr[i] + " ");
            }
        }
    }

}
