package com.ssadhukhanv2.algo.algorepo.arrays;

/**
 * @author Subhrajit Sadhukhan
 */
public class StockBuyAndSellMaxProfit {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 3, 8, 12};
        System.out.println(findMaxProfit(arr));
    }

    public static int findMaxProfit(int[] arr) {
        //Complexity O(n)
        int profit = 0;
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                profit += arr[i] - arr[i - 1];
            }
        }
        return profit;
    }
}
